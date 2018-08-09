package com.cognizant.learn.utilities;

import java.awt.Color;
import java.awt.Font;

public class ViewDetails {

	public static final String INTRO_STR = "Lorem Ipsum is simply dummy text of the printing and "
			+ "typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever "
			+ "since the 1500s, when an unknown printer took a galley of type and scrambled it to "
			+ "make a type specimen book. It has survived not only five centuries, but also the "
			+ "leap into electronic typesetting, remaining essentially unchanged. It was popularised"
			+ " in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and"
			+ " more recently with desktop publishing software like Aldus PageMaker including versions "
			+ "of Lorem Ipsum.";

	public static final String PHOEINX_LIFE_CONTENT_Label1 = "\u2022    	axaefair -> GIT URL - development\n";
	public static final String PHOEINX_LIFE_CONTENT_Label2 = "\u2022    	axalife -> GIT URL - R201810-JBCSecurity\n";
	public static final String PHOEINX_LIFE_CONTENT_Label3 = "\u2022	    axalifeportal -> GIT URL - development\n";

	public static final String PHOEINX_LIFE_CONTENT_Label4 = "\u2022    	axalifeportal-ear-1.0.1.0.ear";
	public static final String PHOEINX_LIFE_CONTENT_Label5 = "\u2022    	axalifeportal-war-1.0.1.0.war";

	public static final String PHOEINX_LIFE_CONTENT_Label6 = "\u2022    	axaefair   ";
	public static final String PHOEINX_LIFE_CONTENT_Label7 = "\u2022    	axalife    ";
	public static final String PHOEINX_LIFE_CONTENT_Label8 = "\u2022    	axalifeportal    ";
	public static final String PHOEINX_LIFE_CONTENT_Label9 = "\u2022     axapicasso and cif";

	public static final String PHOEINX_LIFE_CONTENT_Label10 = "Steps: Deployments -> Install -> Browse the ear file -> Next -> Next -> Next -> Finish";

	public static final String PHOEINX_LIFE_CONTENT_Label11 = "  There are some issues faced during the local setup ->";
	public static final String PHOEINX_LIFE_CONTENT_Label12 = "  i)  HTTP to HTTPS";
	public static final String PHOEINX_LIFE_CONTENT_Label13 = "  a)  Problem";
	public static final String PHOEINX_LIFE_CONTENT_Label14 = "  The below url changed to https to https -> ";
	public static final String PHOEINX_LIFE_CONTENT_Label15 = "  https://www.it.ws.axa.be/webservice/life.retail.services/picassohttp/";
	
	public static final String PHOEINX_LIFE_CONTENT_Label16 = "  So this error received while trying to retrieve data from LRS - ";  	
	
	public static final String PHOEINX_LIFE_CONTENT_Label17 = " net.ssl.SSLHandshakeException: sun.security.validator.ValidatorException:"
			+ " PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: "
			+ " unable to find valid certification path to requested target ";
	
	public static final String PHOEINX_LIFE_CONTENT_Label18 = "   b)	 Solution";
	public static final String PHOEINX_LIFE_CONTENT_Label19 = "   Follow the steps mentioned in section “InstallCert used with Java 7";

	public static final String PHOEINX_LIFE_CONTENT_Label20 = "  \u2022  Create a temporary directory (/temp)";
	public static final String PHOEINX_LIFE_CONTENT_Label21 = "  \u2022	  Copy from git the $project/etc/InstallCert.java to /temp";
	 
	public static final String PHOEINX_LIFE_CONTENT_Label22 = "  \u2022	  Compile the java source file";
	public static final String PHOEINX_LIFE_CONTENT_Label23 = "  \u2022	  Put the newly created jssecacerts file inside C:/J/JDK1.7.0/jre/lib/security folder";

	
	public static final String PHOEINX_LIFE_CONTENT_Label24 = "  ii.  SHA1 digest error for org/bouncycastle/jce/provider/JCEECPublicKey.class";

	public static final String PHOEINX_LIFE_CONTENT_Label25 = "  a)	 Problem ";
	public static final String PHOEINX_LIFE_CONTENT_Label26 = "  Received the below error while calling LRS - ";
	public static final String PHOEINX_LIFE_CONTENT_Label27 = "  javax.net.ssl.SSLException: java.lang.SecurityException: ";
	public static final String PHOEINX_LIFE_CONTENT_Label28 = "  SHA1 digest error for org/bouncycastle/jce/provider/JCEECPublicKey.class ";	

	public static final String PHOEINX_LIFE_CONTENT_Label29 = "  b)	 Solution ";
	public static final String PHOEINX_LIFE_CONTENT_Label30 = " To fix the issue, replace the library "
			+ "[MW_HOME]/oracle_common/modules/bcprov-jdk16-1.45.jar with the one downloaded directly"
			+ " from Bouncy Castle home page. Restart the application server to load the new library. "
			+ "To fix the issue, replace the library [MW_HOME]/oracle_common/modules/bcprov-jdk16-1.45.jar "
			+ "with the one downloaded directly from Bouncy Castle home page. Restart the application server "
			+ "to load the new library.";
	
	public static final String PHOEINX_LIFE_CONTENT_Label31 = "  Refer to the below page: ";
	public static final String PHOEINX_LIFE_CONTENT_Label32 = "  http://doc.cloveretl.com/documentation/UserGuide/index.jsp?topic=/com.cloveretl.server.docs/docs/troubleshooting.html";
	
	
	public static Font CLEARNF8 = new Font("Berlin Sans FB Demi", Font.PLAIN, 8);
	public static Font CLEARNF10 = new Font("Berlin Sans FB Demi", Font.PLAIN, 10);
	public static Font CLEARNF12 = new Font("Berlin Sans FB Demi", Font.PLAIN, 12);
	public static Font CLEARNF12B = new Font("Berlin Sans FB Demi", Font.BOLD, 12);
	public static Font CLEARNF14 = new Font("Berlin Sans FB Demi", Font.PLAIN, 14);
	public static Font CLEARNF14B = new Font("Berlin Sans FB Demi", Font.BOLD, 14);
	public static Font CLEARNF15 = new Font("Berlin Sans FB Demi", Font.PLAIN, 15);
	public static Font CLEARNF15B = new Font("Berlin Sans FB Demi", Font.BOLD, 15);
	public static Font CLEARNF16 = new Font("Berlin Sans FB Demi", Font.PLAIN, 16);
	public static Font CLEARNF16B = new Font("Berlin Sans FB Demi", Font.BOLD, 16);
	public static Font CLEARNF32B = new Font("Berlin Sans FB Demi", Font.BOLD, 32);
	public static Font CLEARNF18 = new Font("Berlin Sans FB Demi", Font.PLAIN, 17);
	public static Font CLEARNF18B = new Font("Berlin Sans FB Demi", Font.BOLD, 18);
	public static Font CLEARNF20 = new Font("Berlin Sans FB Demi", Font.PLAIN, 20);
	public static Font CLEARNF20B = new Font("Berlin Sans FB Demi", Font.BOLD, 20);
	public static Font CLEARNF25 = new Font("Berlin Sans FB Demi", Font.PLAIN, 25);
	public static Font CLEARNF25B = new Font("Berlin Sans FB Demi", Font.BOLD, 25);

	public static Color CLEARN_RED = new Color(218,37,28);
	public static Color CLEARN_GREEN = new Color(133,194,38);
	public static Color CLEARN_BLUE = new Color(0,147,221);
	public static Color CLEARN_ORANGE = new Color(244,174,0);
	public static Color CLEARN_BROWN = new Color(184,120,84);
	public static Color CLEARN_BLACK = new Color(0,0,0);
	public static Color CLEARN_WHITE = new Color(0xFFFFFF);
	public static Color CLEARN_TOOLBAR_BACKGROUND = new Color(153, 217, 234);
	public static Color CLEARN_TRUE_COLOR = new Color(241, 251, 217);
	public static Color CLEARN_FALSE_COLOR = new Color(250, 190, 193);
	public static Color CLEARN_TABLE_BACKGROUND_YELLOW = new Color(185, 230, 240);
	public static Color CLEARN_BACKGROUND_COLOR = new Color(41, 58, 66);
	public static Color CLEARN_FOOTER_COLOR = new Color(155, 225, 255);
	public static Color CLEARN_FOOTER_COLOR_TWO = new Color(0, 184, 200);
	public static Color CLEARN_BODY_COLOR_TWO = new Color(173, 216, 230);
	public static Color CLEARN_CONTENT_HEADER_COLOR = new Color(102, 205, 170);
	public static Color CLEARN_CONTENT_COLOR = new Color(176, 224, 230);

	public static Color scrollBarBackGround = ViewDetails.CLEARN_GREEN;

}
