import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class RestaurantService {
    private List<Restaurant> restaurants = new ArrayList<>();


    public Restaurant findRestaurantByName(String restaurantName)  throws restaurantNotFoundException {
        for (Restaurant findRestaurant : restaurants){
            if (findRestaurant.getName().equals(restaurantName)){
                return findRestaurant;
            }
        }
        throw new restaurantNotFoundException(restaurantName);
//        //DELETE ABOVE STATEMENT AND WRITE CODE HERE
    }

    public Restaurant addRestaurant(String name, String location, LocalTime openingTime, LocalTime closingTime) {
        Restaurant newRestaurant = new Restaurant("Amelie's cafe", "Chennai", LocalTime.parse("10:30:00"), LocalTime.parse("22:00:00"));
        restaurants.add(newRestaurant);
        return newRestaurant;
    }

    public Restaurant removeRestaurant(String restaurantName) throws restaurantNotFoundException {
        Restaurant restaurantToBeRemoved = findRestaurantByName(restaurantName);
        restaurants.remove(restaurantToBeRemoved);
        return restaurantToBeRemoved;
    }

    public List<Restaurant> getRestaurants() {
        return restaurants;
    }
}
