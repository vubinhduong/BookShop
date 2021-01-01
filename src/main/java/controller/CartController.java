package controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestMapping;

import model.Cart;
import service.BookService;

@RequestMapping(value = "/cartController")
public class CartController {
	@RequestMapping(value = "/addCart")
    public String addCart(String bookId, HttpSession session) {
        Book book = new BookService().getBookById(bookId);
        List<Cart> listCart = (List<Cart>) session.getAttribute("listCart");
        if (listCart == null) {
            listCart = new ArrayList<>();
            Cart cart = new Cart(book, 1);
            listCart.add(cart);
        } else {
            boolean check = false;
            for (Cart cart : listCart) {
                if (cart.getProduct().getBook_id().equals(bookId)) {
                    check = true;
                    cart.setQuantity(cart.getQuantity() + 1);
                    break;
                }
            }
            if (!check) {
                Cart cart = new Cart(book, 1);
                listCart.add(cart);
            }
        }
        session.setAttribute("listCart", listCart);

        session.setAttribute("totalAmount", calTotalAmount(listCart));
        return "Customer/ShoppingCart";
    }

    public float calTotalAmount(List<Cart> listCart) {
        float totalAmount = 0;
            
        for (Cart cart : listCart) {
            totalAmount += cart.getProduct().getPrice() * cart.getQuantity();
        }
        return totalAmount;
    }
}
