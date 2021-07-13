package com.juaracoding.belajarjpa.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.juaracoding.belajarjpa.entity.BookingModel;
import com.juaracoding.belajarjpa.entity.ContactModel;
import com.juaracoding.belajarjpa.interfaces.BookingRepository;
import com.juaracoding.belajarjpa.interfaces.ContactRepository;
import com.juaracoding.belajarjpa.util.FileUploadUtil;

@Controller
public class HomePage {
	@Autowired
	BookingRepository bookingRepo;
	@Autowired
	ContactRepository contactRepo;
	
	@GetMapping("/")
	public String viewIndex(Model model, HttpSession session) {
		
		
		
		List<String> lstUsrLogin = (List<String>) session.getAttribute("USER_LOGIN") ;
		if (lstUsrLogin == null) {
			
			model.addAttribute("textLoginStatus" , "Login");
			return "redirect:/login";
			
		}
		
		
		
		model.addAttribute("textLoginStatus" , "Logout");
		model.addAttribute("bookingmodel" , new BookingModel());
		model.addAttribute("listActivities", this.contactRepo.findAll());
		
	
		return "index.html";
	}
	
	@GetMapping("/juaracoding")
	public String viewJuaracoding() {
		return "juaracoding.html";
	}
	
	@GetMapping("/pricing")
	public String viewPricing() {
		return "pricing.html";
	}
	
	@GetMapping("/contact")
	public String viewContact(Model model) {
		
		
		model.addAttribute("data", new ContactModel());
		model.addAttribute("pesan", "");
		return "contact.html";
	}
	
	
	@PostMapping("/booking/add")
	public String addBooking(@ModelAttribute BookingModel bookingModel, Model model) {
		
		
		
		
		this.bookingRepo.save(bookingModel);
		return "redirect:/";
	}
	
	
	@PostMapping("/contact/add")
	public String addContact(HttpServletRequest request,@RequestParam("nama") String name , @RequestParam("email")String email,@RequestParam("subject")String subject,
							 @RequestParam("message")String message, @RequestParam("photo") MultipartFile file,Model model) {
		String fileName = StringUtils.cleanPath(file.getOriginalFilename());
		ContactModel contactModel = new ContactModel(0,name,email,subject,message,fileName);
		contactModel.setPhoto(fileName);
		this.contactRepo.save(contactModel);
		
		String uploadDir = "F:/photos/"+fileName;
		try {
			FileUploadUtil.saveFile(uploadDir, fileName, file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		request.getSession().setAttribute("username", name);
		
		
		
		return "redirect:/contact";
	}
	
	@GetMapping("/login")
	public String viewLogin(Model model) {
		
		
		
		return "login.html";
	}
	
	
	
	
	@PostMapping("/ceklogin")
	public String cekLogin(@RequestParam("email") String email , @RequestParam("pass")String password , HttpServletRequest request) {
		
		List<String> lstUsrLogin = (List<String>) request.getAttribute("USER_LOGIN") ;
		if (lstUsrLogin == null) {
			lstUsrLogin = new ArrayList<String>();
			
			
		}
		
		
		if(email.equals("dewabrata@gmail.com") && password.equalsIgnoreCase("12345")) {
			lstUsrLogin.add(email);
			request.getSession().setAttribute("USER_LOGIN", lstUsrLogin);
			
			return "redirect:/";
		}else {
	
			return "redirect:/login";
		}
	}
	
	@GetMapping("/logout")
	public String viewLogOut(HttpServletRequest request, Model model) {
		
		request.getSession().invalidate();		
		
		
		return "redirect:/";
	}
	


}
