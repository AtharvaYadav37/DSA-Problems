class FoodRatings {

    class Food{
        String food;
        int rating;

        Food(String s, int r){
            food = s;
            rating = r;
        }
    }

    HashMap<String, Integer> f2r = new HashMap<>();                     //food to rating
    HashMap<String, String> f2c = new HashMap<>();
    HashMap<String, PriorityQueue<Food>> maxPQ = new HashMap<>();     //cuisine as key, PQ has foods

    Comparator<Food> customComp = (f1, f2) -> {
    int r1 = f1.rating;
    int r2 = f2.rating;

    if (r1 != r2) {
        return r2 - r1; // higher rating first
    }
    return f1.food.compareTo(f2.food); // lexicographically smaller first
    };

    public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
        for(int i = 0; i < foods.length; i++){
            f2r.put(foods[i], ratings[i]);
            f2c.put(foods[i], cuisines[i]);
            Food temp = new Food(foods[i], ratings[i]);
            makePQ(temp, cuisines[i]);
        }
    }

    public void changeRating(String food, int newRating) {
        f2r.put(food, newRating);
        Food temp = new Food(food, newRating);
        makePQ(temp, f2c.get(food));
    }

    public String highestRated(String cuisine) {
        PriorityQueue<Food> pq = maxPQ.get(cuisine);
        while(true){
            Food temp = pq.peek();
            if(temp.rating == f2r.get(temp.food))
                return temp.food;
            temp = pq.poll();
        }
    }

    public void makePQ(Food temp, String c){
        if(!maxPQ.containsKey(c))
            maxPQ.put(c, new PriorityQueue<>(customComp));
        maxPQ.get(c).add(temp);
    }
}

/**
 * Your FoodRatings object will be instantiated and called as such:
 * FoodRatings obj = new FoodRatings(foods, cuisines, ratings);
 * obj.changeRating(food,newRating);
 * String param_2 = obj.highestRated(cuisine);
 */