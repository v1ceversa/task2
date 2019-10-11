package by.epam.task2.comparator;

import java.util.Comparator;

import by.epam.task2.model.Airliner;
import by.epam.task2.model.Plane;

public class ConveniencesComparator  implements Comparator<Plane>{

	@Override
	public int compare(Plane o1, Plane o2) {
		if (o1 instanceof Airliner) {
			if (o2 instanceof Airliner) {
				return ((Airliner) o1).getConveniences().compareTo(((Airliner) o2).getConveniences());
			}
			else {
				return 1;
			}
		}
		else if (o2 instanceof Airliner) {
			return -1;
		}
		return 0;
	}

}
