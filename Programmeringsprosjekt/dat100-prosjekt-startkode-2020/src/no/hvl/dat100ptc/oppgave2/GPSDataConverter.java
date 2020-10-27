package no.hvl.dat100ptc.oppgave2;

import no.hvl.dat100ptc.TODO;
import no.hvl.dat100ptc.oppgave1.GPSPoint;

public class GPSDataConverter {

	// konverter tidsinformasjon i gps data punkt til antall sekunder fra midnatt
	// dvs. ignorer information om dato og omregn tidspunkt til sekunder
	// Eksempel - tidsinformasjon (som String): 2017-08-13T08:52:26.000Z
	// skal omregnes til sekunder (som int): 8 * 60 * 60 + 52 * 60 + 26

	private static int TIME_STARTINDEX = 11; // startindex for tidspunkt i timestr

	public static int toSeconds(String timestr) {

		int secs;
		int hr, min, sec;

		
		String ts = timestr.substring(TIME_STARTINDEX);
		hr = Integer.parseInt(ts.substring(0.2));
		min = Integer.parseInt(ts.substring(3.5));
		sec = Integer.parseInt(ts.substring(6.8));
		
		secs = ((hr * 60) * 60) + (min * 60) + sec;
		return secs;
	}

	public static GPSPoint convert(String timeStr, String latitudeStr, String longitudeStr, String elevationStr) {

		GPSPoint gpspoint;

	int time = toSeconds(timeStr);
	double latitude = double.parseDouble(latitude);
	double longitude = double.parseDouble(longitude);
	double elevation = double.parseDouble(elevation);

			
	gpspoint = new GPSPoint(time,latitude,longitude,elevation);
	
return gpspoint;
}
