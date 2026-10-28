package day14;

class User {
	
	  int id;
	    String name;

	    User(int id, String name) {
	        this.id = id;
	        this.name = name;
	    }

	    public boolean equals(Object obj) {

	        if (!(obj instanceof User)) {
	            return false;
	        }

	        User other = (User) obj;

	        return this.id == other.id;
	    }

	    public int hashCode() {
	        return id;
	    }

}
