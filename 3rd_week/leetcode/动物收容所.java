class AnimalShelf {
        LinkedList<int[]> queueCat;
        LinkedList<int[]> queueDog;
    public AnimalShelf() {
        queueCat = new LinkedList<>();
        queueDog = new LinkedList<>();
    }
     

    public void enqueue(int[] animal) {
        if(animal[1]==0) queueCat.add(animal);
        else queueDog.add(animal);
    }
    
    public int[] dequeueAny() {
int[] headCat;
        if (!queueCat.isEmpty()) {
            headCat = queueCat.getFirst();
        } else if (!queueDog.isEmpty()) {
            return queueDog.poll();
        } else {
            return new int[]{-1,-1};
        }
        int[] headDog;
        if (!queueDog.isEmpty()) {
            headDog = queueDog.getFirst();
        } else {
            return queueCat.poll();
        }
        if (headCat[0]<=headDog[0]) {
            return queueCat.poll();
        } else {
            return queueDog.poll();
        }
    }
    
    public int[] dequeueDog() {
        if(!queueDog.isEmpty()){
            return queueDog.poll();
        }
        else 
        return new int[] {-1,-1};
    }
    
    public int[] dequeueCat() {
        if(!queueCat.isEmpty()){
            return queueCat.poll();
        }
        else 
        return new int[] {-1,-1};
    }
}

/**
 * Your AnimalShelf object will be instantiated and called as such:
 * AnimalShelf obj = new AnimalShelf();
 * obj.enqueue(animal);
 * int[] param_2 = obj.dequeueAny();
 * int[] param_3 = obj.dequeueDog();
 * int[] param_4 = obj.dequeueCat();
 */