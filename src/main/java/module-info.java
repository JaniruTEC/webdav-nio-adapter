module org.cryptomator.webdav.server {
	exports org.cryptomator.frontend.webdav;
	exports org.cryptomator.frontend.webdav.mount;
	exports org.cryptomator.frontend.webdav.servlet;

	requires javax.servlet.api;
	requires javax.inject;
	requires jsr305;

	requires org.slf4j;
	requires org.cryptomator.webdav.servlet;
	requires com.google.common;

	requires jetty.servlet;
	requires jetty.server;
	requires jetty.util;
	requires dagger;
}