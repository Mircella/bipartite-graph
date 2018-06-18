import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
class GrantingRequest {
    List<PersonRequest> personRequests;
    List<AvailableParkingSpot> availableParkingSpots;
//
//    public GrantingRequest(List<PersonRequest> personRequests, List<AvailableParkingSpot> availableParkingSpots) {
//        this.personRequests = personRequests;
//        this.availableParkingSpots = availableParkingSpots;
//    }
}
