/*
 * A Weather Client using XML
 * Name: Pruthvi Raju Muthyam ID: 1001400715, Spring 17
 * CSE 5306 Lab #3
 * 
 * Weather Client which takes latitude and longitude as inputs and displays 
 * four weather variables to the screen.
 * 
 * References: 
 * 1) https://graphical.weather.gov/xml/
 * 2) https://javabrains.io/courses/javaee_jaxws
 * 3) https://www.tutorialspoint.com/java_xml/java_dom_parse_document.htm
 */


package org.com.client;

import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.net.URL;

import java.rmi.RemoteException;
import java.util.Calendar;
import java.util.Date;

import javax.swing.*;


import org.apache.axis.AxisFault;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;


import gov.weather.graphical.xml.DWMLgen.schema.DWML_xsd.ProductType;
import gov.weather.graphical.xml.DWMLgen.schema.DWML_xsd.UnitType;
import gov.weather.graphical.xml.DWMLgen.schema.DWML_xsd.WeatherParametersType;

import gov.weather.graphical.xml.DWMLgen.wsdl.ndfdXML_wsdl.NdfdXMLBindingStub;

public class WeatherClient {
	//Main window for displaying the weather variables
			private static JFrame mainScreen = new JFrame();
			
			//Button for refresh
			private static JButton refreshButton = new JButton("Refresh");
			
			//Label showing weather information
			private static JLabel weatherLabel = new JLabel();
			
			
			//Button for getting the weather information
			private static JButton startButton = new JButton("Get Weather Information");

			//Text area showing the weather information
			public static JTextArea activityArea = new JTextArea();
			//Scrollpane holding the text area 
			public static JScrollPane conversationScrollPane = new JScrollPane();
			
			//Label for selecting displaying latitude and longitude
			private static JLabel latLabel = new JLabel("Latitude:");
			private static JLabel longLabel = new JLabel("Longitude:");
			//text fields for entering latitude and longitude values
			private static JTextField latitude = new JTextField();
			private static JTextField longitude = new JTextField();
			

	public static void main(String[] args) {
		
		//Method for building the GUI
		BuildGui();
        //Actual sending of soap request and getting response back
		SoapRequest();
	}

	//method for sending request and getting response back as xml.
	private static void SoapRequest() {
		
		/*
		 * adding action listener method for the "Get Weather Information" button and 
		 * action performed when button is pressed.
		 */
		startButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				//a new object of weather client is created
				WeatherClient wc = new WeatherClient();
				//method invoking for sending the soap request and getting response 
				wc.getWeatherInfo(e);
			}

			
		});
		
		/*
		 * adding action listener method for the "Refresh" button and 
		 * action performed when button is pressed.
		 */
		
		
		refreshButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				activityArea.append("\n \n Refreshing...");
				////a new object of weather client is created
				WeatherClient wc = new WeatherClient();
				////method invoking for sending the soap request and getting response 
				wc.getWeatherInfo(e);
			}
		});	
	}	
	/*
	 * method for sending SOAP request to the web service and getting the repsonse
	 * and displaying it on the main screen.
	 */

	protected void getWeatherInfo(ActionEvent e) {
		
		/*
		 * variables for getting latitude and longitude from the text fields
		 */
		
		String lat = latitude.getText();
		String longi = longitude.getText();
		//converting string values to big decimal and setting it to variables
		BigDecimal latitude = new BigDecimal(Double.parseDouble(lat));
		BigDecimal longitude = new BigDecimal(Double.parseDouble(longi));
		
		/*
		 * setting the product type to "time-series" for getting all data between the 
		 * start and end times for the selected weather parameters
		 */
		ProductType p =ProductType.fromValue("time-series");
		//setting unit to "e" for the data to be retrieved in US standard units
		UnitType unit = UnitType.fromValue("e");
		/*
		 * creating date objects and getting current time from the system and 
		 * creating calendar objects for start and end time.
		 * both the values are kept equal so that weather info for the instance
		 * can be fetched.
		 */
		
		Date d  = new Date(System.currentTimeMillis());
		Calendar start_time= Calendar.getInstance();
		start_time.setTime(d);
		Calendar end_time= Calendar.getInstance();
		start_time.setTime(d);
		//weather parameters set to true or false for them to be fetched
		WeatherParametersType wt = new WeatherParametersType();
		String result;
		
		
		//Endpoint URL
		String url = "https://graphical.weather.gov:443/xml/SOAP_server/ndfdXMLserver.php";
		
		//URL object
			URL link;
			try {
				link = new URL(url);
				//stub object to call method of the webservice to send soap request
				NdfdXMLBindingStub stub = new NdfdXMLBindingStub(link, null);
				//calling "NDFDgen"  from the stub object to fetch results.
				 result = stub.NDFDgen(latitude, longitude, p, start_time, end_time,unit, wt);
			System.out.println(result);
				
				/*
				 * DOM for parsing the result XML.
				 * creating a DOM object to obtain a parser to produce DOM object trees 
				 */
				DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
				try {
					//getting instance of DocumentBuilder from the factory object
					DocumentBuilder builder = factory.newDocumentBuilder();
					//String builder object for managing the strings from XML
					StringBuilder sBuilder = new StringBuilder();
					//appending result XML to the String Builder Object
					sBuilder.append(result);
					ByteArrayInputStream bais = new ByteArrayInputStream(sBuilder.toString()
							.getBytes("UTF-8"));
					//getting root of the XML by the Document object
					Document doc = builder.parse(bais);
					/*
					 * getting four weather variables from the result XML and 
					 * setting it to strings
					 */
				String temp = 	doc.getElementsByTagName("temperature").item(0).getTextContent();
				String humidity = 	doc.getElementsByTagName("humidity").item(0).getTextContent();
				String windSpeed = 	doc.getElementsByTagName("wind-speed").item(0).getTextContent();
				String cloudAmount = 	doc.getElementsByTagName("cloud-amount").item(0).getTextContent();
				
					System.out.println(temp+"Fahrenheit");
					//appending the information to the display screen
					activityArea.append("\n"+temp+"Fahrenheit"+humidity+"percent"+windSpeed+"knots"
							+cloudAmount+"precent");
					//XML parsing configuration error
				} catch (ParserConfigurationException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
					//invalid character encoding for the ByteArrayInputStream
				} catch (UnsupportedEncodingException e3) {
					// TODO Auto-generated catch block
					e3.printStackTrace();
					//error related to the XML parser
				} catch (SAXException e4) {
					// TODO Auto-generated catch block
					e4.printStackTrace();
				} catch (IOException e5) {
					// TODO Auto-generated catch block
					e5.printStackTrace();
				}
				//Malformed URL exception	
			} catch (MalformedURLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (AxisFault e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
				//failed remote calls
			} catch (RemoteException e3) {
				// TODO Auto-generated catch block
				e3.printStackTrace();
			}		
		
	}

	/*
	 * Method for building the GUI
	 */
	private static void BuildGui() {
		//setting the main window title
		mainScreen.setTitle("Weather Client");
		//setting the size for the main window
		mainScreen.setSize(200,700);
		//enabling visibility of main window
		mainScreen.setVisible(true);
		
		//setting the main window size
		mainScreen.setSize(375,350);
		//setting layout inside the frame
		mainScreen.getContentPane().setLayout(null);
		//adding processes label to the main window
				mainScreen.getContentPane().add(latLabel);
				mainScreen.getContentPane().add(longLabel);
				mainScreen.getContentPane().add(latitude);
				mainScreen.getContentPane().add(longitude);
				
		//positing the restart button in the main window and setting width and height
		//restartButton.setBounds(250, 40, 81, 25);
		//positing the crash button in the main window and setting width and height
		refreshButton.setBounds(250,10,81,25);
		//positing the start button in the main window and setting width and height
				startButton.setBounds(13,270,323,25);
		//adding start button to the main window
				mainScreen.getContentPane().add(startButton);
		
				/*
				 * positing the select process label in the main window 
				 * and setting width and height
				 */
				latLabel.setBounds(10,10,80,20);
				longLabel.setBounds(10,30,80,20);
				latitude.setBounds(90,10,80,20);
				longitude.setBounds(90,30,80,20);
		//adding refresh button to the main window
		mainScreen.getContentPane().add(refreshButton);
		
		//adding conversation label to the main window
		mainScreen.getContentPane().add(weatherLabel);
		
		
		
		/*
		 * positing the conversation label in the main window 
		 * and setting width and height
		 */
		weatherLabel.setBounds(100,70,140,16);
		
		/*
		 * configuring the text area which shows the election process
		 * and the token exchange between the processes.
		 */
		
		activityArea.setColumns(20);
		activityArea.setRows(5);
		activityArea.setEditable(false);
		
		/*
		 * configuring the scroll pane
		 * adding text area to the scroll pane
		 * positioning the scroll pane in the main window and setting height and width
		 * and finally adding it to the main window
		 */
		conversationScrollPane.setViewportView(activityArea);
		mainScreen.getContentPane().add(conversationScrollPane);
		conversationScrollPane.setBounds(10,90,330,180);
		mainScreen.getContentPane().add(conversationScrollPane);

		
		
	}

}
