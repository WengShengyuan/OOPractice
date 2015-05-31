package proxypattern.virtualproxy.impl;

import java.net.URL;

import javax.swing.ImageIcon;

import proxypattern.virtualproxy.interfaces.Icon;

public class ImageProxy implements Icon {
	
	ImageIcon imageIcon;
	URL imageURL;
	Thread retrievalThread;
	boolean retrieving = false;
	
	public ImageProxy(URL url){
		imageURL = url;
	}
	

	@Override
	public int getIconWidth() {
		if(imageIcon != null){
			return imageIcon.getIconWidth();
		} else {
			return 800;
		}
	}

	@Override
	public int getIconHeight() {
		if(imageIcon != null){
			return imageIcon.getIconHeight();
		} else {
			return 600;
		}
	}

	@Override
	public void paintIcon() {
		if(imageIcon != null){
			System.out.println("Real Image got");
		} else {
			//维持一个线程在后台获取图片
			System.out.println("Loading...");
			if(! retrieving){
				retrieving = true;
				retrievalThread = new Thread(new Runnable() {
					public void run() {
						try{
							imageIcon = new ImageIcon(imageURL, "CD Cover");
							System.out.println("Image got");
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
				retrievalThread.start();
			}
		}
	}

}
