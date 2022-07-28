package com.movieTicket.MovieTicketBooking.Request;

public class PaymentRequest {
	
	
	
	int paymentId;
	long amount;
	String timeStamp;
	int discountCouponId;
	int remoteTansactionId;
	String paymentMethod;
	int bookingId;
	public int getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}
	public long getAmount() {
		return amount;
	}
	public void setAmount(long amount) {
		this.amount = amount;
	}
	public String getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}
	public int getDiscountCouponId() {
		return discountCouponId;
	}
	public void setDiscountCouponId(int discountCouponId) {
		this.discountCouponId = discountCouponId;
	}
	public int getRemoteTansactionId() {
		return remoteTansactionId;
	}
	public void setRemoteTansactionId(int remoteTansactionId) {
		this.remoteTansactionId = remoteTansactionId;
	}
	public String getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	
	

}
