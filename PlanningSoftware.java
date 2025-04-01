
import java.awt.*;

import javax.swing.*;

public class PlanningSoftware {
    AirportDatabase portDbase;
    AirplaneDatabase planeDbase;

    /*
     * Constructor
     */
    Public PlanningSoftware() {
        Construct an empty AirportDatabase for portDbase;
        Construct an empty AirplaneDatabase for planeDbase;
    }

    /*
     * This next functions sets the parameters for what the user will input and the
     * data that will be collected
     * 
     * @param: none
     * 
     * @return: none
     */
 public void FlightPlanning(){
    Distance D;
	Aerodrome a1;
    Longitude l1;
    Latitude l2;
    FuelCapacity FC;
    RefuelRequirements RR;
	Airplane plane;
	Airport port;
	Airspeed AR;
	String make, model, type;
	String str1, str2, str3;

	Prompt user for the make of the airplane;
    input = JOptionPane("What is the make?");
	Let make be the input;
	Prompt the user input for the model of the airplane
    input = JOptionPane("What is the model?");
	Let model be the input;
	Prompt user input for the type of Airplane;
    input = JOptionPane("What is the type?");
	Let type be the input;

    Call search(make, model, type) function in AirplaneDatabase and let the return value                  be plane;
	
	Prompt user input for ICAO identifier/ Longitude and Latitude of starting airport;
    input = JOptionPane("What is the ICAO identifier/ Longitude and Latitude of starting airport?");
	Let str1 be the input;

    Call search(s1) in AirportDatabase and let return value be port;
	Add port into Airport a1;

	Prompt user input for the ICAO identifier/ Longitude and Latitude of the destination station;
    s2 = JOptionPane("What is the ICAO identifier/ Longitude and Latitude of the destination station?");
	Let s2 be the input;

    Call search(s2) in AirportDatabase and let return value be port;
	Add port into Airport a1;
	Ask the user if the s2 is their final destination;
    input = JOptionPane("Is s2 the final destination?");

    While (the answer is not){
		Prompt user input for the ICAO identifier/ Longitude and Latitude of the destination station;
        s3 = JOptionPane("What is the ICAO identifier/ Longitude and Latitude of the destination station?");
		Let s3 be the input;

    Call search(s3) in AirportDatabase and let return value be port;
		Add port into Airport a1;
		Ask the user if the s2 is there final destination;
	}

    For m:=1

    to (size of a1-1){
		Let s1 be mth element of a1;
		Let s2 be m+1th element of a1;
		If s2 is the final destination, then{

    Call fuelEnough(plane, s1.getLatitude(), s1.getLongitude(), s2.getLatitude(), s2.getLongitude()) function, if return value is false, then{
				Call function addRefuelingStop(plane, s1, s2)and let the return value be port;
				If port is not NULL, then
				Insert drome into m+1th position of a1;
			}
		}Else{
			Increment m by 1;
			Let s2 be m+1th element of a1;

    Call fuelEnough(plane,  s1.getlongitude(), s1.getLongitude(), s2.getLatitude(), s2.getLongitude(), s3.getLatitude(), s3.getLatitude()) function, if return value is false, then{
				Call function addRefuelingStop(plane,s1,s2,s3) and let return value be port;
				If drome is not NULL, then
				Replace m+1th element of Airport with a1 with port;
			}
		}

    Call function

    output(plane, a1)
}

    /*
     * this method calculates the actual distance between a starting and destination
     * airplane
     * 
     * @param lat1 -double, the latitude of the 1st station
     * 
     * @param long1- double, the longitude of the 1st station
     * 
     * @param lat2- double, the latitude of the 2nd station
     * 
     * @param long2- double, the longitude of the 2nd station
     * 
     * @return the distance of two stations
     */
    public double distanceOfLegs(double lat1, double long1, double lat2, double long2) {
        double distance;
        double R = 6371 / 1.85; // the radius of the earth in knot
        // use the following formula to calculate the distance between the two stations
        // by the latitude and longitude given;
        distance = Math.sqrt(R * (Math.pow(Math.sin(lat2) - Math.sin(lat1), 2) + Math.pow(Math.cos(lat2), 2)
                + Math.pow(Math.cos(lat1), 2) - 2 * Math.cos(lat1) * Math.cos(lat2) * Math.cos(long2 - long1)));
        return distance;
    }

    Print that the fuel is not enough for two stations, please enter the refueling stop station;
    Int m, fuel_type;

For (m = 0 to the size of the portDbase - 1) {
    Airport temp;
    Double angle;
   	Let temp be the element of portDbase at m;

    Call getAngle(s1.getLatitude(), s1.getLongitude(), temp.getLatitude(), temp.getLongitude());
    	Let angle be the return value;

    If (angle is between 0 and 180) then {
        		fuel_type = (temp.getFuel()).getType();

    If (the fuel_type is the same as that of rule of the airplane) then {
           	 If (Both fuelEnough(w, a, s1.getLatitude(), s1.getLongitude(),
               	 temp.getLatitude(), temp.getLongitude())

    and fuelEnough(w, a,
               	 temp.getLatitude(), temp.getLongitude(), s2.getLatitude(),
               	 s2.getLongitude()) are true) then
               	 Return temp;
      	  }}}

    print the information to show that we can not find a suitable refueling stop.
    Return null;

    /*
     * this method is to find the maximum distance that an Airplaneplane ap can fly
     * without refilling its tank.
     * 
     * @param ap is the Airplane
     * 
     * @return a double value to represent the maximum distance in miles that
     * Airplane ap can fly.
     */
    Public

    double calculateHeading() {
    }

    public double getMaxRangeOfAeroplane(Wind w, Aeroplane a, double lat1, double long1, double lat2, double long2) {
        double max_distance,capacity,burn_rate;double time;double real_airspeed;

        call function getRealAirspeed(w,a.getAirspeed(),lat1,long1,lat2,long2);
        let real_airspeed be the return value of the above function;

        call function getFuelCapacity() in the Airplane class;

    }
    /*
     * this calculates the actual direction a plane must travel between a starting
     * and ending airport,
     * 
     * @paranam lat1 - double, the latitude of the first station
     * 
     * @paranam long1 - double, the longitude of the first station
     * 
     * @paranam lat1 - double, the latitude of the first station
     * 
     * @paranam long1 - double, the longitude of the first station
     * 
     * @return the distance of to stations
     */
    Public

    double calculateHeading(double airspeed, double lat1, double long1, double lat2, double long2) {
        Double angle;
        Let angle be the result of the formula:Heading=arctan⁡(sin⁡(Δlong)⋅cos⁡(lat2)/cos⁡(lat1)⋅sin⁡(lat2)−sin⁡(lat1)⋅cos⁡(lat2)⋅cos⁡(Δlong))Return angle;
    }

    /* User class */
    userDatabase userDbase;
    /*
     * Constructor
     */
    Public

    class Userclass {
Construct an
        empty UserDatabase for userDbase;
    }

    /*
     * This next functions sets the parameters for what the user will input and the
     * data that will be collected
     * 
     * @param: none
     * 
     * @return: none
     */
public void Add() {
	string fname;
	string lname;
	String pnumber;
	String haddress;
	Sting eaddress;

	prompt user input for first name of the user;
    input = JOptionPane("What is the first name?");
	let fname be the input;
	prompt user input for last name of the user;
    input = JOptionPane("What is the last name?");
	let lname be the input;
	prompt user input for the phone number of the user;
    input = JOptionPane("What is the phone number?");
	let pnumber be the input;
	prompt user input for the home address of the user;
    input = JOptionPane("What is the home address?");
	let haddress be the input;
	prompt user input for the Email address of the user;
    input = JOptionPane("What is the email address?");
	let eaddress be the input;
	assign key addition in chronological order upon confirmation of submission;

    btnSubmit() {
create gui element for confirmation of submission of input variables;
p1.add(new JButton("Confirm"));
send submission to userDatabase and display results;
}

}

public void modify() {
Display gui elements of current values the customer entered;
Access current values assigned to the users specific  submission;

btnSubmit() {
create gui element for confirmation of submission of input variables;
p1.add(new JButton("Confirm"));
send submission to UserDatabase and display results;
}

}

public void delete() {
	Display gui elements of current values the customer entered;
delete current values assigned to the users specific  submission;

btnSubmit() {
create gui element for confirmation of submission of input variables;
p1.add(new JButton("Confirm"));
send submission to UserDatabase and display results;
}

}

public void printList() {
	Display gui elements of current values the customer entered;
view current values assigned to the users specific  submission;

btnSubmit() {
create gui element for confirmation of submission of input variables;
p1.add(new JButton("Confirm"));
send submission to UserDatabase and display results;
}

}

private void isValid() {
	Display gui elements of current values the customer entered;
confirm current values assigned to the users specific  submission;

btnSubmit() {
create gui element for confirmation of submission of input variables;
p1.add(new JButton("Confirm"));
send submission to UserDatabase and display results;
}

}

public void showMenu() {
Display gui elements of current values the customer entered;
display current values assigned to the users specific submission;

btnSubmit() {
create gui element for confirmation of submission of input variables;
p1.add(new JButton("Confirm"));
send submission to UserDatabase and display results;
}
    /* AirportManager */
    Public

    class AirportManager {

        AirportDatabase portDbase;

        public AirportManager() {
            Access AirportDatabase for portDbase;
        }
        /*
         * This function on startup is used to access the preexisting airport database
         */

    public void addAirport() {
        string name;
        string icao;
        double longitude;
        double latitude;
        int fuelType;
        int key;

        prompt user input for name of airport;
        input = JOptionPane("What is the airport name?");
        let name be the user response;
        prompt user input for ICAO identifier of airport;
        input = JOptionPane("What is the ICAOIdentifier?");
        let icao be the user response;
        prompt user for latitude of airport;
        input = JOptionPane("What is the latitude?");
        let latitude be the user response;
        prompt user for longitude of airport;
        input = JOptionPane("What is the longitude?");
        let longitude be the user response;
        prompt user for airport fuel type;
        input = JOptionPane("What is the airport fuel type?");
        let fuelType be the user response;
        assign key addition in chronological order upon confirmation of submission;

        btnSubmit() {
            create GUI element for confirmation of submission of input variables;
            p1.add(new JButton("Confirm"));
            send submission to AirportDatabase and display results;
        }
    }

    public void searchAirport() {
        Insert GUI dropdown menu displaying airport elements;
        Insert GUI textbox for manual search input;
        send query to database;
        summarize closest matching element selected between dropdown and text input;
        Send summary to variable x;
        Display GUI popup with results=x;
    }

    public void modifyAirport() {
        Display GUI elements of current list of active airports;
        Access current values assigned to a selected submission;
        Display values of a selected airport in a text box, allow user edits;

    btnSubmit() {
            create GUI element for confirmation of submission of modified values;
            p1.add(new JButton("Confirm"));
            save updated values and display results;
        }

}

public void deleteAirport() {
        Display GUI elements of current list of active airports;
        Access current values assigned to a submission;
        Display values of a selected airport;

    btnDelete() {
            Create GUI popup: "Do you wish to delete the selected airport?";
            If yes → erase selected `portDbase` element;
            Else cancel → terminate popup;
        }

}

public void printAirportList() {
        Display GUI elements of current airports entered;
        View current values assigned to the user's specific submission;

    btnSubmit() {
            create GUI element for confirmation of submission of input variables;
            p1.add(new JButton("Confirm"));
            send submission to UserDatabase and display results;
        }

}

Private

void validateAirportData() {
        Display GUI elements showing current values entered by the user;
        Confirm validity of assigned values for the user's submission;

    btnSubmit() {
            create GUI element for confirmation of validation;
            p1.add(new JButton("Confirm"));
            send submission to UserDatabase and display validation results;
        }

}

public void showMenu() {
        Display GUI elements showing current user-entered values;
        Display current values assigned to the user's specific submission;

    btnSubmit() {
            create GUI element for confirmation of submission of input variables;
            p1.add(new JButton("Confirm"));
            send submission to UserDatabase and display results;
        }
}}
/* AirplaneManager */

Public

class airplaneManager {

    AirplaneDatabase planeDbase;

public airplaneDatabase() {
	Access AirplaneDatabase for planeDbase;
}
    /*
     * This function on startup is used to access the preexisting airplane database
     */

public void Add() {
	string make;
	string model;
             string AircraftType;
	double FuelSize;
	string fuel;
	double fuel burn;
	int airspeed;
	prompt user input for name of make;
    name = JOptionPane("What is the name of the make?");
	let name be the input;
	prompt user input for name of model;
    name = JOptionPane("What is the name of the model?");
	let name be the input;
	prompt user for type of aircraft;
    type = JOptionPane("What is the type of the aircraft?");
	let type be the input;
prompt user for size of fuel;
size = JOptionPane("What is the size of the fuel?");
let size be the input;
prompt user for airplane fuel burn;
burn = JOptionPane("What is the airplane fuel burn?");
Let burn be the input;
//assign key addition in chronological order upon confirmation of submission;

btnSubmit() {
create gui element for confirmation of submission of input variables;
p1.add(new JButton("Confirm"));
send submission to AirplaneDatabase and display results;
}

}

    public void search() {
        Insert GUI dropdown menu displaying airplane elements;Insert GUI textbox for manual search input;send query to database;summarize closest matching element selected between dropdown and text input;Send summary to variable x;Display GUI popup with results=x;

    }

public void modify() {
Display gui elements of current list of active airplanes;
Access current values assigned to a submission;
Display values of a selected airplane;

btnSubmit() {
create gui element for confirmation of submission of input variables;
p1.add(new JButton("Confirm"));
send submission to AirplaneDatabase and display results;
}

}

public void delete() {

        Display GUI elements of current list of active airports;
        Access current values assigned to a submission;
        Display values of a selected airplane;

    btnDelete() {
            Create GUI popup: "Do you wish to delete the selected airplane?";
            If yes → erase selected `planeDbase element;
            Else cancel → terminate popup;
}

}

public void printList() {
  Display GUI elements of current airplanes entered;
        View current values assigned to the user's specific submission;

    btnSubmit() {
            create GUI element for confirmation of submission of input variables;
            p1.add(new JButton("Confirm"));
            send submission to UserDatabase and display results;
        }

}

private void isValid() {
Display gui elements of current values the customer entered;
p1.add(new JButton("Confirm"));
confirm current values assigned to the users specific submission;

btnSubmit() {
create gui element for confirmation of submission of input variables;
p1.add(new JButton("Confirm"));
send submission to UserDatabase and display results;
}

}

public void showMenu() {
 Display GUI elements showing current user-entered values;
        Display current values assigned to the user's specific submission;

    btnSubmit() {
            create GUI element for confirmation of submission of input variables;
            p1.add(new JButton("Confirm"));
            send submission to UserDatabase and display results;
        }
}}

/* Airplane Class */
Public

class Airplane {

    string Make;
    string Model;
    string AircraftType;
    double FuelSize;
    string Fuel;
    double FuelBurn;
    int Airspeed;

    public Airplane() {
        Initialize default airplane values;
    }
    /* This function is used to create an Airplane object with default values */

    public void setMake() {
        string input;
        prompt user input for airplane make;
        input=JOptionPane("What is the Make?");
        let input be the user response;Assign input to Make;
    }

    public void setModel() {
        string input;
        prompt user input for airplane model;
        input=JOptionPane("What is the Model?");
        let input be the user response;Assign input to Model;
    }

    public void setAircraftType() {
        string input;
        prompt user input for aircraft type;
        input=JOptionPane("What is the Aircraft Type?");
        let input be the user response;
        Assign input to AircraftType;
    }

    public void setFuelSize() {
        double input;
        prompt user input for fuel size;
        input=JOptionPane("What is the fuel size?");
        let input be the user response;
        Assign input to FuelSize;
    }

    public void setFuel() {
        string input;
        prompt user input for fuel type;
        input=JOptionPane("What is the fuel type?");
        let input be the user response;
        Assign input to Fuel;
    }

    public void setFuelBurn() {
        double input;
        prompt user input for fuel burn rate;
        input=JOptionPane("What is the fuel burn rate?");
        let input be the user response;
        Assign input to FuelBurn;
    }

    public void setAirSpeed() {
        int input;
        prompt user input for airspeed;
        input=JOptionPane("What is the airspeed?");
        let input be the user response;
        Assign input to Airspeed;
    }

    public string getMake() {
        Return Make;
    }

    public string getModel() {
        Return Model;
    }

    public string getAircraftType() {
        Return AircraftType;
    }

    public int getFuelSize() {
        Return FuelSize;
    }

    public string getFuel() {
        Return Fuel;
    }

    public int getFuelBurn() {
        Return FuelBurn;
    }

    public int getAirSpeed() {
        Return Airspeed;
    }

    public void print() {
        Display gui elements showing current values;
        Display: "Make: " + Make;
        Display: "Model: " + Model;
        Display: "Aircraft Type: " + AircraftType;
        Display: "Fuel Size: " + FuelSize;
        Display: "Fuel Type: " + Fuel;
        Display: "Fuel Burn Rate: " + FuelBurn;
        Display: "Airspeed: " + Airspeed;

    btnSubmit() {
            create gui element for confirmation of displaying airplane information;
            p1.add(new JButton("Confirm"));
            display results;
        }

    }

    public void modify() {
        Display gui elements showing current values;
        Allow user to modify Make, Model, AircraftType, FuelSize, Fuel, FuelBurn, and Airspeed;

    btnSubmit() {
            create gui element for confirmation of submission of modified values;
            p1.add(new JButton("Confirm"));
            save updated values and display results;
        }

}

public void isValid() {
        Validate that all required fields are filled;
        If valid, return success message;
        Else, prompt user to complete missing information;

    btnSubmit() {
            create gui element for confirmation of validation;
            p1.add(new JButton("Confirm"));
            display validation results;
        }
}}

/* Airport Class */

Public

class Airport {

    string NameOfAirport;
    string ICAOIdentifier;
    float Longitude;
    float Latitude;
    float RadioFrequency;
    string RadioType;
    string FuelTypes;

    public Airport() {
        Initialize default airport values;
    }
    /* This function is used to create an Airport object with default values */

    public void setNameAirport() {
        string input;
        prompt user input for airport name;
        input=JOptionPane("What is the Airport Name?");
        let input be the user response;Assign input to NameOfAirport;
    }

    public void setICAOIdentifier() {
        string input;
        prompt user input for ICAO Identifier;
        input=JOptionPane("What is the ICAOIdentifier?");
        let input be the user response;
        Assign input to ICAOIdentifier;
    }

    public void setLongitude() {
        float input;
        prompt user input for longitude;
        input=JOptionPane("What is the longitude?");
        let input be the user response;
        Assign input to Longitude;
    }

    public void setLatitude() {
        float input;
        // prompt user input for latitude;
        input=JOptionPane("What is the latitude?");
        let input be the user response;
        Assign input to Latitude;
    }

    public void setRadioFrequency() {
        float input;
        prompt user input for radio frequency;
        input=JOptionPane("What is the radio frequency?");
        let input be the user response;
        Assign input to RadioFrequency;
    }

    public void setRadioType() {
        string input;
        prompt user input for radio type;
        input=JOptionPane("What is the radio type?");
        let input be the user response;
        Assign input to RadioType;
    }

    public void setFuelTypes() {
        string input;
        prompt user input for fuel types;
        input=JOptionPane("What is the fuel type?");
        let input be the user response;
        Assign input to FuelTypes;
    }

    public string getFuelTypes() {
        Return FuelTypes;
    }

    public float getRadioFrequency() {
        Return RadioFrequency;
    }

    public string getRadioType() {
        Return RadioType;
    }

    public string getAirportName() {
        Return NameOfAirport;
    }

    public string getICAOIdentifier() {
        Return ICAOIdentifier;
    }

    public float getLongitude() {
        Return Longitude;
    }

    public float getLatitude() {
        Return Latitude;
    }

    public void print() {
        Display GUI elements showing current values;
        Display: "Airport Name: " + NameOfAirport;
        Display: "ICAO Identifier: " + ICAOIdentifier;
        Display: "Longitude: " + Longitude;
        Display: "Latitude: " + Latitude;
        Display: "Radio Frequency: " + RadioFrequency;
        Display: "Radio Type: " + RadioType;
        Display: "Fuel Types: " + FuelTypes;

    btnSubmit() {
            create GUI element for confirmation of displaying airport information;
            p1.add(new JButton("Confirm"));
            display results;
        }

    }

    public void modify() {
        Display GUI elements showing current values;
        Allow user to modify NameOfAirport, ICAOIdentifier, Longitude, Latitude, RadioFrequency, RadioType, FuelTypes;

    btnSubmit() {
            create GUI element for confirmation of submission of modified values;
            p1.add(new JButton("Confirm"));
            save updated values and display results;
        }

}

public void isValid() {
        Validate that all required fields are filled;
        If valid, return success message;
        Else, prompt user to complete missing information;

    btnSubmit() {
            create GUI element for confirmation of validation;
            p1.add(new JButton("Confirm"));
            display validation results;
        }
}}
