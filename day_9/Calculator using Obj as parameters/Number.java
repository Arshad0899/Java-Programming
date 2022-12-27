package com.quest.day_9;

public class Number {
	
	private int num;
	private int result;
	
	public Number(int num) {
		this.num = num;
	}
	
	public Number() {
		
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	
	public int getNum() {
		return num;
	}

	public Number add(Number obj) {
		Number add = new Number();
		add.result = this.num + obj.num;
		return add;
	}
	
	public Number subtract(Number obj) {
		Number sub = new Number();
		sub.result = this.num - obj.num;
		return sub;
	}
	
	public Number multiply(Number obj) {
		Number mul = new Number();
		mul.result = this.num * obj.num;
		return mul;
	}
	
	public Number division(Number obj) {
		Number div = new Number();
		if(obj.num != 0) {
			div.result = this.num / obj.num;
		}
		else {
			System.out.println("Undefined!");			
			div.result = 0;
		}
		return div;
	}
	
	public Number modulo(Number obj) {
		Number mod = new Number();
		if(obj.num != 0) {
			mod.result = this.num % obj.num;
		}
		else {
			System.out.println("Undefined!");			
			mod.result = 0;
		}
		return mod;
	}


	public int getResult() {
		return result;
	}
	
}
