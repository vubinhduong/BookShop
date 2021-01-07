package controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import model.BillDetail;
import model.Book;
import model.User;
import service.BillSevice;
import service.BookService;
import service.UserService;

@Controller
public class AdminController {
	BookService bookService;
	
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
		List<User> listUser = new UserService().getAllUser();
		List<BillDetail> listBillDetail = new ArrayList<BillDetail>();
		for (User user : listUser) {
			List<BillDetail> list = new BillSevice().getBillByUsername(user.getUsername());
			listBillDetail.addAll(list);
		}
		mav.addObject("listBillDetail", listBillDetail);
		return mav;
	}

	@RequestMapping(value = "/addBook", method = RequestMethod.GET)
	public ModelAndView addBook() {
		ModelAndView mav = new ModelAndView("admin/addBook");
		return mav;
	}

	@RequestMapping(value = "/addBookFill", method = RequestMethod.GET)
	public ModelAndView addBookFill(@RequestParam(value = "bookId") String bookId,
			@RequestParam(value = "bookName") String bookName, @RequestParam(value = "pages") int pages,
			@RequestParam(value = "NXB") String NXB, @RequestParam(value = "nam") int nam,
			@RequestParam(value = "price") int price, @RequestParam(value = "discount") int discount, @RequestParam(value = "author") String author,
			@RequestParam(value = "image") String image, @RequestParam(value = "content") String content) {
		if (bookService.checkBook(bookId)) {
			return addBook();
		} else {
			bookService.addBook(bookId, bookName, pages, NXB, nam, price, discount, author, image, content);
			return dataBookPage();
		}
	}

	@RequestMapping(value = "/charts", method = RequestMethod.GET)
	public ModelAndView chartsPage() {
		ModelAndView mav = new ModelAndView("admin/charts");
		return mav;
	}
}
