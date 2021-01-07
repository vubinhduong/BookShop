package controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import model.Book;
import service.BookService;

@Controller
public class AdminController {
	@RequestMapping(value = "/adminPage", method = RequestMethod.GET)
	public ModelAndView adminPage() {
		ModelAndView mav = new ModelAndView("admin/index");
		return mav;
	}
	
	
	@RequestMapping(value = "/dataBook", method = RequestMethod.GET)
	public ModelAndView dataBookPage() {
		ModelAndView mav = new ModelAndView("admin/tables");
		List<Book> allBook = new BookService().getAllBook();
		mav.addObject("allBook", allBook);
		return mav;
	}
	
	@RequestMapping(value = "/dataBill", method = RequestMethod.GET)
	public ModelAndView dataBookBill() {
		ModelAndView mav = new ModelAndView("admin/tables2");
		List<Book> allBook = new BookService().getAllBook();
		mav.addObject("allBook", allBook);
		return mav;
	}
	
	@RequestMapping(value = "/charts", method = RequestMethod.GET)
	public ModelAndView chartsPage() {
		ModelAndView mav = new ModelAndView("admin/charts");
		return mav;
	}
}
