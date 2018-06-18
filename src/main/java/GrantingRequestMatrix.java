import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.junit.platform.commons.util.Preconditions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

@Data
@AllArgsConstructor
@NoArgsConstructor
class GrantingRequestMatrix {

    GrantingRequest grantingRequest;
    GrantingResult grantingResult;
    int[][] matrix;

    public GrantingRequestMatrix(GrantingRequest grantingRequest) {
        this.grantingRequest = grantingRequest;
    }

    public int[][] fillMatrix() {
        List<PersonRequest> personRequests = grantingRequest.personRequests;
        List<AvailableParkingSpot> availableParkingSpots = grantingRequest.availableParkingSpots;
        this.matrix = new int[personRequests.size()][availableParkingSpots.size()];
        personRequests.forEach(request -> {
            IntStream.range(0, availableParkingSpots.size()).forEach(i -> {
                if (request.areaCodes.contains(availableParkingSpots.get(i).areaCode)) {
                    this.matrix[personRequests.indexOf(request)][i] = 1;
                }
            });
        });
        return this.matrix;
    }

    public void printMatrix(int[][]matrix) {
        Preconditions.notNull(matrix, "Matrix is null");
        this.matrix = matrix;
        Arrays.stream(this.matrix).forEach(a -> {
            Arrays.stream(a).forEach(b -> System.out.print(b + " "));
            System.out.println();
        });
    }
}
