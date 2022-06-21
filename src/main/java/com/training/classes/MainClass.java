package com.training.classes;

import java.awt.geom.Point2D;
import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import com.training.classes.aggregation.task1.Text;
import com.training.classes.aggregation.task5.Categories;
import com.training.classes.aggregation.task5.ListOfVouchers;
import com.training.classes.aggregation.task5.Nutritions;
import com.training.classes.aggregation.task5.TouristAgency;
import com.training.classes.aggregation.task5.Transports;
import com.training.classes.aggregation.task5.Voucher;
import com.training.classes.simpleclasses.task10.Airline;
import com.training.classes.simpleclasses.task10.Airlines;
import com.training.classes.simpleclasses.task3.Student;
import com.training.classes.simpleclasses.task4.Train;
import com.training.classes.simpleclasses.task5.DecimalCounter;
import com.training.classes.simpleclasses.task6.Time;
import com.training.classes.simpleclasses.task7.Triangle;
import com.training.classes.simpleclasses.task8.Customer;
import com.training.classes.simpleclasses.task8.Customers;
import com.training.classes.simpleclasses.task9.Books;

public class MainClass {
	public static void main(String[] args) {
//		simpleClassesFivthTask();
//		simpleClassesSixthTask();
//		simpleClassesSeventhTask();
//		simpleClassesEighthTask();
//		simpleClassesNinthTask();
//		simpleClassesTenthTask();
//		aggregationFirstTask();
//		aggregationFivthTask();

	}

	public static void simpleClassesFourthTask() {
		List<Train> trainList = new ArrayList<Train>() {
			{
				add(new Train(5, "Brest", LocalTime.of(15, 20)));
				add(new Train(4, "Minsk", LocalTime.of(12, 30)));
				add(new Train(1, "Kyiv", LocalTime.of(17, 00)));
				add(new Train(2, "Brest", LocalTime.of(14, 40)));
				add(new Train(3, "Vilnius", LocalTime.of(8, 10)));
			}
		};
		System.out.println(trainList.toString());
//		Collections.sort(trainList);
		Train.sortByDestinationAndDepartureTime(trainList);
		System.out.println(trainList.toString());
	}

	public static void simpleClassesFivthTask() {
		DecimalCounter dc = new DecimalCounter(5, 1, 10);
		System.out.println("specific: " + dc);
		DecimalCounter dcDefault = new DecimalCounter(15);
		System.out.println("default: " + dcDefault);
		DecimalCounter dcRandom = new DecimalCounter(1, 10);
		System.out.println("random: " + dcRandom);
		dc.decreaseByOne();
		System.out.println("specific - 1: " + dc);
		dc.increaseByOne();
		dc.increaseByOne();
		System.out.println("then specific + 2: " + dc.getCounter());
	}

	public static void simpleClassesSixthTask() {
		Time time = new Time(5, 7, 96);
		System.out.println(time);
		time.setSeconds(45);
		System.out.println(time);
	}

	public static void simpleClassesSeventhTask() {
		Triangle triangle = new Triangle(new Point2D.Double(-2, 1), new Point2D.Double(3, 4), new Point2D.Double(5, 0));
		System.out.println(triangle.areaOfTriangle());
		System.out.println(triangle.centroidOfTriangle().toString());
		System.out.println(triangle.perimeterOFTriangle());
	}

	public static void simpleClassesEighthTask() {
		Customers customers = new Customers();
		customers.addCustomer(new Customer("Alex", "Skorb", "Petrovich", "adress", 4, 123456789));
		customers.addCustomer(new Customer("Alex", "Skorb", "Ivanovich", "adress", 7, 123456789));
		customers.addCustomer(new Customer("Alex", "Averv", "Ardegbdfb", "adress", 5, 123456789));
		customers.addCustomer(new Customer("Gbfgbf", "Rhngn", "Vbfgb", "adress", 6, 123456789));
		customers.addCustomer(new Customer("Evdbfgb", "Dbfgbf", "Hbfgbfg", "adress", 12, 123456789));
		customers.addCustomer(new Customer("Abrfgngh", "Acfbf", "Athggbn", "adress", 1234, 123456789));
		customers.sortByFullName();
		System.out.println(customers);
		System.out.println(customers.customersByCreditCardInterval(5, 12));
	}

	public static void simpleClassesNinthTask() {
		Books books = new Books();
		books.addBook(new com.training.classes.simpleclasses.task9.Book("BookName1",
				new HashSet<String>(Arrays.asList("Alex", "Dmitriy")), "publishingHouse1", 12, 235, 1, "pereplet"));
		books.addBook(new com.training.classes.simpleclasses.task9.Book("BookName2",
				new HashSet<String>(Arrays.asList("Natasha", "Dmitriy")), "publishingHouse2", 5, 235, 1, "pereplet"));
		books.addBook(new com.training.classes.simpleclasses.task9.Book("BookName3",
				new HashSet<String>(Arrays.asList("Sergey", "Dmitriy")), "publishingHouse1", 4, 235, 1, "pereplet"));
		books.addBook(new com.training.classes.simpleclasses.task9.Book("BookName4",
				new HashSet<String>(Arrays.asList("Pietr", "Natasha")), "publishingHouse3", 11, 235, 1, "pereplet"));
		System.out.println(books.getBooksByAuthor("Natasha"));
		System.out.println(books.getBooksByPublishingHouse("publishingHouse1"));
		System.out.println(books.getBooksAfterSpecifiedYear(10));
	}

	public static void simpleClassesTenthTask() {
		Airlines airlines = new Airlines();
		airlines.addAirline(new Airline("Grodno", 4, "aircraftType", LocalTime.of(13, 30),
				new HashSet<>(Arrays.asList(DayOfWeek.SUNDAY, DayOfWeek.FRIDAY, DayOfWeek.SATURDAY))));
		airlines.addAirline(new Airline("Minsk", 4, "aircraftType", LocalTime.of(15, 30),
				new HashSet<>(Arrays.asList(DayOfWeek.MONDAY, DayOfWeek.SUNDAY))));
		airlines.addAirline(new Airline("Grodno", 4, "aircraftType", LocalTime.of(11, 30),
				new HashSet<>(Arrays.asList(DayOfWeek.MONDAY, DayOfWeek.FRIDAY))));
		airlines.addAirline(new Airline("Brest", 4, "aircraftType", LocalTime.of(15, 30),
				new HashSet<>(Arrays.asList(DayOfWeek.MONDAY, DayOfWeek.FRIDAY, DayOfWeek.SATURDAY))));
		airlines.addAirline(new Airline("Gomel", 4, "aircraftType", LocalTime.of(16, 20),
				new HashSet<>(Arrays.asList(DayOfWeek.MONDAY, DayOfWeek.SUNDAY, DayOfWeek.SATURDAY))));
		System.out.println(airlines.getAirlinesByDestination("Grodno"));
		System.out.println(airlines.getAirlinerByDayOfWeek(DayOfWeek.SUNDAY));
		System.out
				.println(airlines.getAirlinesByDayOfWeekAndAdterSpecifiedTime(DayOfWeek.SUNDAY, LocalTime.of(14, 10)));
	}

	public static void aggregationFirstTask() {
		String str = "qqq www eeeeee rrrrr\n aaaa sss ddd fffffff. zzzzz xxxxx cccc vvvvv. pppp lll mm.";
		Text text = new Text(str);
		text.addSentence("qwed vdfvds svdfbv vdsfvd");
		System.out.println(text);
	}

	public static void aggregationFourthTask() {

	}

	public static void aggregationFivthTask() {
		ListOfVouchers vouchers = new ListOfVouchers();
		vouchers.addVoucher(
				new Voucher("Voucher 6", Categories.CRUISE, 45, Transports.TRAIN, Nutritions.NORTH_CUISINE));
		vouchers.addVoucher(
				new Voucher("Voucher 5", Categories.EXCURSION, 20, Transports.BUS, Nutritions.SOUTH_CUISINE));
		vouchers.addVoucher(
				new Voucher("Voucher 3", Categories.RECREATION, 14, Transports.AIRPLANE, Nutritions.EASTERN_CUISINE));
		vouchers.addVoucher(
				new Voucher("Voucher 4", Categories.SHOPPING, 15, Transports.TRAIN, Nutritions.WESTERN_CUISINE));
		vouchers.addVoucher(
				new Voucher("Voucher 2", Categories.THERAPY, 18, Transports.CAMEL, Nutritions.SOUTH_CUISINE));
		vouchers.addVoucher(
				new Voucher("Voucher 1", Categories.CRUISE, 15, Transports.ELEPHANT, Nutritions.NORTH_CUISINE));
		vouchers.addVoucher(
				new Voucher("Voucher 7", Categories.SHOPPING, 17, Transports.TRAIN, Nutritions.WESTERN_CUISINE));
		TouristAgency tAgency = new TouristAgency("Вокруг света за 60 секунд.", vouchers);
		System.out.println(tAgency.printVouchers());
		tAgency.getVouchers().sortByName();
		System.out.println(tAgency.printVouchers());
		Voucher searchingVoucher = new Voucher(null, Categories.SHOPPING, 0, Transports.TRAIN, null);
		System.out.println(tAgency.searchByParameters(searchingVoucher));

	}
}
