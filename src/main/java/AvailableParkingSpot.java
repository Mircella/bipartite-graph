import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
class AvailableParkingSpot {
    String areaCode;
    String parkingSpotCode;
//
//    public AvailableParkingSpot(String areaCode, String parkingSpotCode) {
//        this.areaCode = areaCode;
//        this.parkingSpotCode = parkingSpotCode;
//    }
}