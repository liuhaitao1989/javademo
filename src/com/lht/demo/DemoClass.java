package com.lht.demo;

import java.util.ArrayList;
import java.util.List;

public class DemoClass {

	public static void main(String[] args) {
		// A.HOST = "http://www.360.com";
		// System.out.println("输出结果1:" + A.URL+"==="+A.HOST+"==="+A.getURL());

		Model model1 = new Model("diyige", "120", "2015", "2");
		Model model2 = new Model("dierge", "67", "2015", "3");
		Model model3 = new Model("disange", "30", "2015", "4");
		List<Model> mList = new ArrayList<Model>();
		List<Model> list = new ArrayList<Model>();
//		mList.add(model1);
//		mList.add(model2);
//		mList.add(model3);

		if (mList.size() == 0) {
			list.add(new Model("diyige", "0", "2015", "2"));
			list.add(new Model("dierge", "0", "2015", "3"));
			list.add(new Model("disange", "0", "2015", "4"));
		}

		if (mList.size() == 1) {
			if ("2".equals(mList.get(0).getMonth())) {
				list.add(mList.get(0));
				list.add(new Model("dierge", "0", "2015", "3"));
				list.add(new Model("disange", "0", "2015", "4"));
			}
			if ("3".equals(mList.get(0).getMonth())) {
				list.add(new Model("diyige", "0", "2015", "2"));
				list.add(mList.get(0));
				list.add(new Model("disange", "0", "2015", "4"));
			}
			if ("4".equals(mList.get(0).getMonth())) {
				list.add(new Model("diyige", "0", "2015", "2"));
				list.add(new Model("disange", "0", "2015", "3"));
				list.add(mList.get(0));
			}
		}

		if (mList.size() == 2) {
			if ("2".equals(mList.get(0).getMonth())) {
				if ("3".equals(mList.get(1).getMonth())) {
					list.add(mList.get(0));
					list.add(mList.get(1));
					list.add(new Model("disange", "0", "2015", "4"));
				}

				if ("4".equals(mList.get(1).getMonth())) {
					list.add(mList.get(0));
					list.add(new Model("disange", "0", "2015", "3"));
					list.add(mList.get(1));
				}
			}

			if ("3".equals(mList.get(0).getMonth())) {
				list.add(new Model("diyige", "0", "2015", "2"));
				list.add(mList.get(0));
				list.add(mList.get(1));
			}

		}

		//jarsigner -verbose -keystore C:\Users\Administrator\Desktop\signcode\jingguan.keystore -signedjar C:\Users\Administrator\Desktop\signcode\lhtsigned.apk C:\Users\Administrator\Desktop\signcode\Liqu.apk C:\Users\Administrator\Desktop\signcode\jingguan.keystore
		//jarsigner -verbose -keystore jingguan.keystore -signedjar lhtsigned.apk Liqu.apk jingguan.keystore
		
//		jarsigner: 找不到C:\Users\Administrator\Desktop\signcode\jingguan.keystore的证书
//		链。C:\Users\Administrator\Desktop\signcode\jingguan.keystore必须引用包含私有密
//		钥和相应的公共密钥证书链的有效密钥库密钥条目。
		if (mList.size() == 3) {
			for (int i = 0; i < 3; i++) {
				list.add(mList.get(i));
			}
		}
		;

		System.out.println("==" + list.size() + "==");
		System.out.println("==" + list.size() + "111111==");
		for (int j = 0; j < list.size(); j++) {
			System.out.println(list.get(j).toString());

		}

	}
}
