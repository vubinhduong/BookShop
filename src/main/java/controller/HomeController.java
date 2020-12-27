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
	public ModelAndView homePage() {
		ModelAndView mav = new ModelAndView("admin/index"); 
		return mav;
	}
	
	@RequestMapping(value = "/toUserPage", method = RequestMethod.GET)
	public ModelAndView toUserPage() {
		ModelAndView mav = new ModelAndView("user/homepage"); 
		List<Book> listBook = new BookService().getAllBook();
		mav.addObject("newProduct", listBook);
		return mav;
	}
	
//	@RequestMapping(value = "/springmvc", method =  RequestMethod.GET)
//	public ModelAndView springMVCPage() {
//		ModelAndView mav = new ModelAndView("springmvc");
//		List<Book> book ;
//		book = BookService().getAllBook();
//		mav.addObject(book);
//		return mav;
//	}
	
}
