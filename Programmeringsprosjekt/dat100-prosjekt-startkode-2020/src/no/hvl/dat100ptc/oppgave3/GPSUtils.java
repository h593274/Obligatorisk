package no.hvl.dat100ptc.oppgave3;

import static java.lang.Math.*;

import java.text.DecimalFormat;

import no.hvl.dat100ptc.TODO;
import no.hvl.dat100ptc.oppgave1.GPSPoint;

public class GPSUtils {

	public static double findMax(double[] da) {

		double max;

		max = da[0];

		for (double d : da) {
			if (d > max) {
				max = d;
			}
		}

		return max;
	}

	public static double findMin(double[] da) {

		double min;

		min = da[0];

		for (double d : da) {
			if (d < min) {
				min = d;
			}
		}

		return min;

	}

	public static double[] getLatitudes(GPSPoint[] gpspoints) {

		double[] latitudetall = new double[gpspoints.length];

		for (int i = 0; i < gpspoints.length; i++) {
			latitudetall[i] = gpspoints[i].getLatitude();
		}

		return latitudetall;

	}

	public static double[] getLongitudes(GPSPoint[] gpspoints) {
		double[] longitudetall = new double[gpspoints.length];

		for (int i = 0; i < gpspoints.length; i++) {
			longitudetall[i] = gpspoints[i].getLongitude();
		}

		return longitudetall;

	}

	private static int R = 6371000; // jordens radius

	public static double distance(GPSPoint gpspoint1, GPSPoint gpspoint2) {

		double d;
		double latitude1, longitude1, latitude2, longitude2;

		double a = Math.sin(Math.pow((Math.toRadians(latitude2) - Math.toRadians(latitude1)), 2))
				+ Math.cos(Math.toRadians(latitude1)) * Math.cos(Math.toRadians(latitude2))
						* Math.sin(Math.pow((Math.toRadians(longitude2) - Math.toRadians(longitude1)), 2));

		double C = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
		;

		double avst = R * C;

		return avst;
	}

	public static double speed(GPSPoint gpspoint1, GPSPoint gpspoint2) {

		int secs;
		double speed;

		double distanse = distance(gpspoint1, gpspoint2);

		secs = gpspoint2.getTime() - gpspoint1.getTime();

		speed = (distanse / secs) * ((60 * 60) / 1000);

		return speed;
	}

	public static String formatTime(int secs) {
		String timestr;
		String TIMESEP = ":";

		int ss = secs % 60;
		{
			String ssstr = Integer.toString(ss);
			if (ss < 10) {
				ssstr = "0" + ssstr;
			}
		}
		int mm=(secs/60)%60;
		{
			String ssstr = Integer.toString(ss);
			if (ss < 10) {
				ssstr = "0" + ssstr;
			}
		}
		int hh=secs/(60*60);
		{
			String ssstr = Integer.toString(ss);
			if (ss < 10) {
				ssstr = "0" + ssstr;
			}
		}

	timestr=String.format("%10s",(hhstr+TIMESEP+mmstr+));
		
			return timestr;
	}

	private static int TEXTWIDTH = 10;

	public static String formatDouble(double d) {
str= String.format("%.2f",d);

str=String.format("%10",str);
		return str;

	}
}
