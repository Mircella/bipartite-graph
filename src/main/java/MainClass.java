import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        List<String> areaCodes = Arrays.asList("A", "B", "C", "D", "E", "F");
        List<PersonRequest> personRequests = Arrays.asList(
                new PersonRequest("person1", Arrays.asList(areaCodes.get(0))),
                new PersonRequest("person2", Arrays.asList(areaCodes.get(0), areaCodes.get(2))),
                new PersonRequest("person3", Arrays.asList(areaCodes.get(1), areaCodes.get(2), areaCodes.get(4))),
                new PersonRequest("person4", Arrays.asList(areaCodes.get(1), areaCodes.get(5))),
                new PersonRequest("person5", Arrays.asList(areaCodes.get(3), areaCodes.get(4), areaCodes.get(5))),
                new PersonRequest("person6", Arrays.asList(areaCodes.get(1), areaCodes.get(4))),
                new PersonRequest("person7", Arrays.asList(areaCodes.get(0), areaCodes.get(3), areaCodes.get(4), areaCodes.get(2))),
                new PersonRequest("person8", Arrays.asList(areaCodes.get(2), areaCodes.get(5))),
                new PersonRequest("person9", Arrays.asList(areaCodes.get(3), areaCodes.get(5))),
                new PersonRequest("person10", Arrays.asList(areaCodes.get(2), areaCodes.get(4))),
                new PersonRequest("person11", Arrays.asList(areaCodes.get(0), areaCodes.get(3), areaCodes.get(5))),
                new PersonRequest("person12", Arrays.asList(areaCodes.get(0), areaCodes.get(1))),
                new PersonRequest("person13", Arrays.asList(areaCodes.get(2))),
                new PersonRequest("person14", Arrays.asList(areaCodes.get(4))),
                new PersonRequest("person15", Arrays.asList(areaCodes.get(4)))

        );
        List<AvailableParkingSpot> availableParkingSpots = Arrays.asList(
                new AvailableParkingSpot(areaCodes.get(0), "A1"),
                new AvailableParkingSpot(areaCodes.get(1), "B1"),
                new AvailableParkingSpot(areaCodes.get(1), "B2"),
                new AvailableParkingSpot(areaCodes.get(2), "C1"),
                new AvailableParkingSpot(areaCodes.get(2), "C2"),
                new AvailableParkingSpot(areaCodes.get(3), "D1"),
                new AvailableParkingSpot(areaCodes.get(3), "D2"),
                new AvailableParkingSpot(areaCodes.get(4), "E1"),
                new AvailableParkingSpot(areaCodes.get(5), "F1")
        );

        GrantingRequest grantingRequest = new GrantingRequest(personRequests, availableParkingSpots);
        GrantingRequestMatrix grantingRequestMatrix = new GrantingRequestMatrix(grantingRequest);
        int [][] matrix = grantingRequestMatrix.fillMatrix();
        grantingRequestMatrix.printMatrix(matrix);
    }

}
