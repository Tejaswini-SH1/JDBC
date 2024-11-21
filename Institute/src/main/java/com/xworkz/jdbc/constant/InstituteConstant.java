package com.xworkz.jdbc.constant;


public enum InstituteConstant {
		URL("jdbc:mysql://127.0.0.1:3306/institute"), USERNAME("root"), PASSWORD("root");
		private String value;
		private InstituteConstant(String value) {
			this.value=value;
		}
		public String getValue() {
			return value;
		}

}
