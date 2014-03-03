/*
 * Copyright (C) 2014 RAED
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package tn.mariages.util.facebook;

import chrriis.dj.nativeswing.swtimpl.components.JWebBrowser;
import chrriis.dj.nativeswing.swtimpl.components.WebBrowserAdapter;
import chrriis.dj.nativeswing.swtimpl.components.WebBrowserNavigationEvent;
import java.awt.BorderLayout;
import java.io.IOException;
import java.io.StringReader;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.text.html.HTMLEditorKit;
import javax.swing.text.html.parser.ParserDelegator;
import static tn.mariages.gui.FacebookLoginTEST.access_token;
import static tn.mariages.gui.FacebookLoginTEST.firstRequest;
import static tn.mariages.gui.FacebookLoginTEST.firstRequestDone;
import static tn.mariages.gui.FacebookLoginTEST.secondRequest;
import static tn.mariages.gui.FacebookLoginTEST.secondRequestDone;

/**
 *
 * @author RAED
 */
public class Auth {
       public void auth(){
         
        final JFrame authFrame = new JFrame();
                      // Create the JWebBrowser and add the WebBrowserAdapter
                      JPanel webBrowserPanel = new JPanel(new BorderLayout());
                      final JWebBrowser webBrowser = new JWebBrowser();
                      webBrowser.navigate(firstRequest);
                      webBrowser.addWebBrowserListener(new WebBrowserAdapter() {
                        @Override
                        public void locationChanged(WebBrowserNavigationEvent e) {
                          super.locationChanged(e);
                          // Check if first request was not done
                          if (!firstRequestDone) {
                            // Check if you left the location and were redirected to the next 
                            // location
                            if (e.getNewResourceLocation().contains("http://www.facebook.com/connect/login_success.html?code=")){
                              // If it successfully redirects you, get the verification code
                              // and go for a second request
                              String[] splits = e.getNewResourceLocation().split("=");
                              String stage2temp = secondRequest + splits[1];
                                System.out.println("First ="+splits[1]);
                              webBrowser.navigate(stage2temp);
                              firstRequestDone = true;
                            }
                          } 
                          else {
                            // If secondRequest is not done yet, you perform this and get the 
                            // access_token
                            if (!secondRequestDone) {
                              System.out.println(webBrowser.getHTMLContent());
                              // Create reader with the html content
                              StringReader readerSTR = new StringReader(webBrowser.getHTMLContent());
                              // Create a callback for html parser
                              HTMLEditorKit.ParserCallback callback = 
                              new HTMLEditorKit.ParserCallback() {
                                  @Override
                                public void handleText(char[] data,int pos) {
                                  System.out.println(data);
                                  // because there is only one line with the access_token 
                                  // in the html content you can parse it.
                                  String string = new String(data);
                                  String[] temp1 = string.split("&");
                                  String[] temp2 = temp1[0].split("=");
                                      System.out.println("access tocken="+temp2);
                                  access_token = temp2[1];
                                }
                              };
                              try {
                                // Call the parse method 
                                new ParserDelegator().parse(readerSTR,callback,false);
                              } catch (IOException e1) {
                                e1.printStackTrace();
                              }
                              // After everything is done, you can dispose the jframe
                              //authFrame.dispose();      
                            }
                          }
                        }
                      });
                      webBrowserPanel.add(webBrowser,BorderLayout.CENTER);
                      authFrame.add(webBrowserPanel);
                      authFrame.setSize(500, 500);
                      authFrame.setVisible(true);
        
        
        
        
    }

}
