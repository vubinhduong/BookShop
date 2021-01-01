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
		List<Book> listNewBook = new BookService().getBoolNew();
		List<Book> listBestSeller = new BookService().getBookHot();
		List<Book> listRandomBook = new BookService().getBookRandom();
		mav.addObject("newProduct", listNewBook);
		mav.addObject("bestSellerProduct", listBestSeller);
		mav.addObject("randomProduct", listRandomBook);
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
		List<Book> listSaleBook = new BookService().getAllBook();
		mav.addObject("saleProduct", listSaleBook);
		return mav;
	}
	
	@RequestMapping(value = "/delivery", method = RequestMethod.GET)
	public ModelAndView deliveryPage() {
		ModelAndView mav = new ModelAndView("user/delivery"); 
		List<Book> allBook = new BookService().getAllBook();
		int size = allBook.size();
		mav.addObject("allProduct", allBook);
		mav.addObject("size", size);
		return mav;
	}
	
	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public ModelAndView searchPage(String genre) {
		ModelAndView mav = new ModelAndView("user/bookSearch"); 
		List<Book> listGenreBook = new BookService().getBookGenre(genre);
		mav.addObject("genreProduct", listGenreBook);
		return mav;
	}
	
	@RequestMapping(value = "/preview", method = RequestMethod.GET)
	public ModelAndView preview() {
		ModelAndView mav = new ModelAndView("user/preview"); 
		return mav;
	}
	
	@RequestMapping(value = "/cart", method = RequestMethod.GET)
	public ModelAndView cartPage() {
		ModelAndView mav = new ModelAndView("user/cart"); 
		return mav;
	}
}
