package controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;

import model.Admin;
import model.Book;
import model.Cart;
import model.Comment;
import model.User;
import service.AdminService;
import service.BillSevice;
import service.BookService;
import service.CommentService;
import service.UserService;

@Controller
public class HomeController {

	AdminService adminService = new AdminService();
	UserService userService = new UserService();
	CommentService commentService = new CommentService();
	BookService bookService = new BookService();
	BillSevice billService = new BillSevice();

	@RequestMapping(value = "/homePage", method = RequestMethod.GET)
	public ModelAndView homePage() {
		ModelAndView mav = new ModelAndView("user/homepage"); // user/homepage
		List<Book> listNewBook = new BookService().getBoolNew();
		List<Book> listBestSeller = new BookService().getBookHot();
		List<Book> listRandomBook = new BookService().getBookRandom();
		mav.addObject("newProduct", listNewBook);
		mav.addObject("bestSellerProduct", listBestSeller);
		mav.addObject("randomProduct", listRandomBook);
		return mav;
	}

	@RequestMapping(value = "/contact", method = RequestMethod.GET)
	public ModelAndView contactPage() {
		ModelAndView mav = new ModelAndView("user/contact");
		return mav;
	}

	@RequestMapping(value = "/about", method = RequestMethod.GET)
	public ModelAndView aboutPage() {
		ModelAndView mav = new ModelAndView("user/about");
		return mav;
	}

	@RequestMapping(value = "/news", method = RequestMethod.GET)
	public ModelAndView newsPage() {
		ModelAndView mav = new ModelAndView("user/news");
		List<Book> listSaleBook = new BookService().getBookDiscount();
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
	
	@RequestMapping(value = "/type", method = RequestMethod.GET)
	public ModelAndView typePage(String type) {
		ModelAndView mav = new ModelAndView("user/type");
		if (type.equals("new")) {
			List<Book> typeProduct = new BookService().getBoolNew();
			mav.addObject("typeProduct", typeProduct);
			return mav;
		} else if (type.equals("hot")) {
			List<Book> typeProduct = new BookService().getBookHot();
			mav.addObject("typeProduct", typeProduct);
			return mav;
		} else {
			List<Book> typeProduct = new BookService().getBookRandom();
			mav.addObject("typeProduct", typeProduct);
			return mav;
		}
	}

	@RequestMapping(value = "/preview", method = RequestMethod.GET)
	public ModelAndView preview(String bookId) {
		ModelAndView mav = new ModelAndView("user/preview");
		Book bookSelected = new BookService().getBookById(bookId);
		List<Comment> listComment = new CommentService().getCmtByBookId(bookId);
		mav.addObject("bookSelected", bookSelected);
		mav.addObject("listComment", listComment);
		return mav;
	}

	@RequestMapping(value = "/searchByName", method = RequestMethod.GET)
	public ModelAndView searchByName(@RequestParam("bookName") String bookName) {
		ModelAndView mav = new ModelAndView("user/delivery");
		List<Book> listBookSearch = new BookService().getBookByName(bookName);
		mav.addObject("allProduct", listBookSearch);
		return mav;
	}

	@RequestMapping(value = "/cart", method = RequestMethod.GET)
	public ModelAndView cartPage() {
		ModelAndView mav = new ModelAndView("user/cart");
		return mav;
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView loginPage() {
		ModelAndView mav = new ModelAndView("user/login");
		return mav;
	}

	@RequestMapping(value = "/logined")
	public ModelAndView logined(@RequestParam("username") String username, @RequestParam("password") String password,
			HttpSession session) {
		if (adminService.checkLoginAdmin(username, password)) {
			ModelAndView mav = new ModelAndView("admin/index");
			Admin adminLogged = new Admin(username, password);
			session.setAttribute("logged", adminLogged);
			return mav;
		} else if (userService.checkLoginUser(username, password)) {
			ModelAndView mav = homePage();
			User userLogged = new User(username, password, "", "", "", "", null);
			session.setAttribute("logged", userLogged);
			return mav;
		} else {
			ModelAndView mav = new ModelAndView("user/login");
			return mav;
		}
	}

	@RequestMapping(value = "/logout")
	public ModelAndView logined(HttpSession session) {
		session.removeAttribute("logged");
		ModelAndView mav = homePage();
		return mav;
	}

	@RequestMapping(value = "/signUp")
	public ModelAndView signUp(@RequestParam("username") String username, @RequestParam("password") String password) {
		if (adminService.checkLoginAdmin(username, password)) {
			ModelAndView mav = new ModelAndView("admin/index");
			return mav;
		} else if (userService.checkLoginUser(username, password)) {
			ModelAndView mav = new ModelAndView("user/homepage");
			return mav;
		} else {
			ModelAndView mav = new ModelAndView("user/login");
			return mav;
		}
	}

	@RequestMapping(value = "/deleteCart")
	public @ResponseBody String deleteCart(@RequestParam(value = "bookId") String bookId, HttpSession session) {
		List<Cart> listCart = (List<Cart>) session.getAttribute("listCart");
		listCart.remove(Cart.getCartByBookId(listCart, bookId));
		String json = "";
		if (listCart != null & listCart.size() > 0) {
			json = new Gson().toJson(listCart);
			System.out.println(json);
			return json;
		}
		return "";
	}

	@RequestMapping(value = "/addCart")
	public String addCart(@RequestParam("bookId") String bookId, @RequestParam("number") String quantity,
			HttpSession session) {
		int quantityInt = Integer.parseInt(quantity);
		Book book = new BookService().getBookById(bookId);
		List<Cart> listCart = (List<Cart>) session.getAttribute("listCart");
		if (listCart == null) {
			listCart = new ArrayList<>();
			Cart cart = new Cart(book, quantityInt);
			listCart.add(cart);
		} else {
			boolean check = false;
			for (Cart cart : listCart) {
				if (cart.getProduct().getBook_id().equals(bookId)) {
					check = true;
					cart.setQuantity(cart.getQuantity() + quantityInt);
					break;
				}
			}
			if (!check) {
				Cart cart = new Cart(book, quantityInt);
				listCart.add(cart);
			}
		}
		session.setAttribute("listCart", listCart);

		session.setAttribute("totalAmount", calTotalAmount(listCart));
		return "user/cart";
	}

	public float calTotalAmount(List<Cart> listCart) {
		float totalAmount = 0;

		for (Cart cart : listCart) {
			totalAmount += cart.getProduct().getPrice() * cart.getQuantity();
		}
		return totalAmount;
	}

	@RequestMapping(value = "/rate")
	public ModelAndView rate(@RequestParam(value = "bookId") String bookId, @RequestParam(value = "number") int number,
			@RequestParam(value = "user") String username) {
		if (username != "") {
			bookService.rateService(bookId, number);
		}
		ModelAndView mav = preview(bookId);
		return mav;
	}

	@RequestMapping(value = "/comment")
	public ModelAndView comment(@RequestParam(value = "bookId") String bookId,
			@RequestParam(value = "comment") String comment, @RequestParam(value = "username") String username) {
		if (username != "") {
			commentService.addCommentByBookId(bookId, comment, username);
		}
		ModelAndView mav = preview(bookId);
		return mav;
	}

	@RequestMapping(value = "/thanhtoan")
	public ModelAndView thanhtoan(@RequestParam(value = "username") String username, HttpSession session){
		List<Cart> listCart = (List<Cart>) session.getAttribute("listCart");
		if (username != "") {
			billService.addBill(username, listCart);
		}
		ModelAndView mav = cartPage();
		return mav;
	}
	
}
