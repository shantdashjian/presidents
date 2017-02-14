package project;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class PresidentsReaderWriter {

	public static void main(String[] args) {
		List<President> presidents = readPresidents("presidents.csv");
		printPresidents(presidents);

		List<President> whigs = filterWhigs(presidents);
		List<President> presidentsWithMiddleNames = filterPresidentsWithMiddleName(presidents);
		// printPresidents(presidentsWithMiddleNames);

		List<President> presidentsWhoServedLessThan4 = filterServedLessThan4(presidents);
		List<President> presidentsWithLastNameThatStartsWithR = filterPresidentsWithLastNameThatStartsWithR(presidents);
		List<President> republicans = filterRepublicans(presidents);
		List<President> democrats = filterDemocrats(presidents);
		List<President> federalists = filterFederalists(presidents);

		writePresidentsToFile(republicans, "republicans.txt");
		writePresidentsToFile(democrats, "democrats.txt");

	}

	public static List<President> filterWhigs(List<President> presidents) {
		List<President> whigs = new ArrayList<>();
		for (President president : presidents) {
			if (president.getParty().equals("Whig")) {
				whigs.add(president);
			}
		}
		return whigs;
	}

	public static List<President> filterPresidentsWithMiddleName(List<President> presidents) {
		List<President> presidentsWithMiddleName = new ArrayList<>();
		for (President president : presidents) {
			if (!president.getMiddleName().equals("")) {
				presidentsWithMiddleName.add(president);
			}
		}
		return presidentsWithMiddleName;
	}

	public static List<President> filterServedLessThan4(List<President> presidents) {
		List<President> presidentsWhoServedLessThan4 = new ArrayList<>();
		for (President president : presidents) {
			if (president.getEndYear() - president.getStartYear() < 4) {
				presidentsWhoServedLessThan4.add(president);
			}
		}
		return presidentsWhoServedLessThan4;
	}

	public static List<President> filterPresidentsWithLastNameThatStartsWithR(List<President> presidents) {
		List<President> presidentsWithLastNameThatStartsWithR = new ArrayList<>();
		for (President president : presidents) {
			if (president.getLastName().charAt(0) == 'R') {
				presidentsWithLastNameThatStartsWithR.add(president);
			}
		}
		return presidentsWithLastNameThatStartsWithR;
	}

	public static List<President> filterRepublicans(List<President> presidents) {
		List<President> republicans = new ArrayList<>();
		for (President president : presidents) {
			if (president.getParty().equals("Republican")) {
				republicans.add(president);
			}
		}
		return republicans;
	}

	public static List<President> filterDemocrats(List<President> presidents) {
		List<President> democrats = new ArrayList<>();
		for (President president : presidents) {
			if (president.getParty().equals("Democrat")) {
				democrats.add(president);
			}
		}
		return democrats;
	}

	public static List<President> filterFederalists(List<President> presidents) {
		List<President> federalists = new ArrayList<>();
		for (President president : presidents) {
			if (president.getParty().equals("Federalist")) {
				federalists.add(president);
			}
		}
		return federalists;
	}

	public static void writePresidentsToFile(List<President> presidents, String fileName) {
		try {
			PrintWriter pw = new PrintWriter(new FileWriter(fileName));
			for (President president : presidents) {
				pw.println(president.getFirstName() + " " + president.getLastName());
			}

			pw.close();
		} catch (IOException ioe) {
			// TODO: handle exception
		}
	}

	public static List<President> readPresidents(String fileName) {
		List<President> presidents = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
			String line = "";
			while ((line = br.readLine()) != null) {
				String[] words = line.split(", ");
				String firstName = words[1];
				String middleName = words[2];
				String lastName = words[3];
				String party = words[5];
				int termNumber = Integer.parseInt(words[0]);
				String[] years = words[4].split("-");
				int startYear = Integer.parseInt(years[0]);
				int endYear = Integer.parseInt(years[1]);
				President president = new President(firstName, middleName, lastName, party, termNumber, startYear,
						endYear);
				presidents.add(president);
			}
		} catch (IOException e) {
			System.err.println(e);
			e.printStackTrace();
		}
		return presidents;
	}

	public static void printPresidents(List<President> presidents) {
		for (President president : presidents) {
			System.out.println(president);
		}
	}

}
