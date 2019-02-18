package model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Comment {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;
	@Column(name = "productId")
	private Integer productId;
	@Column(name = "userId")
	private Integer userId;
	@Column(name = "userName")
	private String userName;
	@Column(name = "message")
	private String message;
	@Column(name = "messageHeading")
	private String messageHeading;
	@Column(name = "date")
	private Date date;
	@Column(name = "email")
	private String email;

	public Comment() {
		super();
	}

	public Comment(Integer id, Integer productId, Integer userId,
			String userName, String message, String messageHeading, Date date,
			String email) {
		super();
		this.id = id;
		this.productId = productId;
		this.userId = userId;
		this.userName = userName;
		this.message = message;
		this.messageHeading = messageHeading;
		this.date = date;
		this.email = email;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessageHeading() {
		return messageHeading;
	}

	public void setMessageHeading(String messageHeading) {
		this.messageHeading = messageHeading;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
