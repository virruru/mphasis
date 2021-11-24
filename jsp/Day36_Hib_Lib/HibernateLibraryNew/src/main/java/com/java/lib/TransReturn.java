package com.java.lib;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="TransReturn")
public class TransReturn {

		private String userName;
		private int bookid;
		private Date fromdate;
		private Date toDate;
		private int tid;
		@Id
		@Column(name="tid")
		public int getTid() {
			return tid;
		}
		public void setTid(int tid) {
			this.tid = tid;
		}
		@Column(name="username")
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		@Column(name="bookid")
		public int getBookid() {
			return bookid;
		}
		public void setBookid(int bookid) {
			this.bookid = bookid;
		}
		@Column(name="fromdate")
		public Date getFromdate() {
			return fromdate;
		}
		public void setFromdate(Date fromdate) {
			this.fromdate = fromdate;
		}
		@Column(name="todate")
		public Date getToDate() {
			return toDate;
		}
		public void setToDate(Date toDate) {
			this.toDate = toDate;
		}
		
}
