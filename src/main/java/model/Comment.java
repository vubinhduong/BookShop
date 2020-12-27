package model;

import java.util.Date;

public class Comment {

   public Comment(int cmt_id, String book_id, String username, Date date_cmt, String content) {
	   super();
	   this.cmt_id = cmt_id;
	   this.book_id = book_id;
	   this.username = username;
	   this.date_cmt = date_cmt;
	   this.content = content;
 }

   private int cmt_id;
   private String book_id;
   private String username;
   private Date date_cmt;
   private String content;

   public int getCmt_id() {
	   return cmt_id;
   }
   public void setCmt_id(int cmt_id) {
	   this.cmt_id = cmt_id;
   }
   public String getBook_id() {
	   return book_id;
   }
   public void setBook_id(String book_id) {
	   this.book_id = book_id;
   }
   public String getUsername() {
	   return username;
   }
   public void setUsername(String username) {
	   this.username = username;
   }
   public Date getDate_cmt() {
	   return date_cmt;
   }
   public void setDate_cmt(Date date_cmt) {
	   this.date_cmt = date_cmt;
   }
   public String getContent() {
	   return content;
   }
   public void setContent(String content) {
	   this.content = content;
   }


}
