package controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import model.Book;
import service.BookService;

@Controller
public class HomeController {
	
	@RequestMapping(value = "/trang-chu", method = RequestMethod.GET)
	public ModelAndView homepage() {
		ModelAndView mav = new ModelAndView("admin/index"); //admin/index
		return mav;
	}
	
	@RequestMapping(value = "/homePage", method = RequestMethod.GET)
	public ModelAndView homePage() {
		ModelAndView mav = new ModelAndView("user/homepage"); //sửa từ homepage thành contact thì controller sẽ chuyển thành contact
		List<Book> listBook = new BookService().getAllBook();
		mav.addObject("newProduct", listBook);
		return mav;
	}
	
	@RequestMapping(value = "/about", method = RequestMethod.GET)
	public ModelAndView aboutPage() {
		ModelAndView mav = new ModelAndView("user/about"); 
		return mav;
	}

	@RequestMapping(value = "/contact", method = RequestMethod.GET)
	public ModelAndView contactPage() {
		ModelAndView mav = new ModelAndView("user/contact"); 
		return mav;
	}
	
	@RequestMapping(value = "/news", method = RequestMethod.GET)
	public ModelAndView newsPage() {
		ModelAndView mav = new ModelAndView("user/news"); 
		return mav;
	}
	
	@RequestMapping(value = "/delivery", method = RequestMethod.GET)
	public ModelAndView deliveryPage() {
		ModelAndView mav = new ModelAndView("user/delivery"); 
		return mav;
	}
	
	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public ModelAndView searchPage() {
		ModelAndView mav = new ModelAndView("user/bookSearch"); 
		return mav;
	}
	
	@RequestMapping(value = "/preview", method = RequestMethod.GET)
	public ModelAndView preview() {
		ModelAndView mav = new ModelAndView("user/preview"); 
		return mav;
	}
}
