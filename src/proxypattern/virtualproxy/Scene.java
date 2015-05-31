package proxypattern.virtualproxy;

import java.net.MalformedURLException;
import java.net.URL;

import proxypattern.virtualproxy.impl.ImageProxy;
import proxypattern.virtualproxy.interfaces.Icon;

public class Scene {

	public static void main(String[] args) {
		URL imageUrl;
		String urlStr = "http://image.baidu.com/detail/newindex?col=%E5%AE%A0%E7%89%A9&tag=%E5%85%A8%E9%83%A8&pn=1&pid=9612624060&aid=&user_id=154318104&setid=-1&sort=0&newsPn=&star=&fr=&from=1";
		try {
			imageUrl = new URL(urlStr);
			Icon icon = new ImageProxy(imageUrl);
			icon.paintIcon();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

	}

}
