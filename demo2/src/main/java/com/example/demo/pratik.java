package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class pratik {

		private int id;
		private String name;
		private String tech;
		
		
		
		public pratik() {
			super();
			System.out.println("object created");
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getTech() {
			return tech;
		}
		public void setTech(String tech) {
			this.tech = tech;
		}
		public void show()
		{
			System.out.println("in show");
		}
}
