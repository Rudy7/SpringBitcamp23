package com.bitcamp.web.enums;

public enum Path {
	resources,js,img,css,
	JS{
		public String toString() {
			return "/"+resources+"/"+js;
		}
	},
	IMG{
		public String toString() {
			return "/"+resources+"/"+img;
		}
	},
	CSS{
		public String toString() {
			return "/"+resources+"/"+css;
		}
	}
}
