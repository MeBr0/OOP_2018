package third;

class Person  {
    private String name;
    private int id;

    public Person(){ }

    public Person(String name, int id){
        this.name = name;
        this.id = id;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    @Override
    public String toString(){
        return String.format("Name: %s, ID: %d", this.name, this.id);
    }

    @Override
    public boolean equals(Object object){
        if (object instanceof Person){

            Person other = (Person) object;

            return (this.name.equals(other.name) && this.id == other.id);
        }
        else{
            return false;
        }
    }
}