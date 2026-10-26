package day12;

class User {

	int id;
    String name;

    User(int id, String name) {
    	this.id = id;
    	this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        // id가 같으면 true
    	boolean bresult = false;
    	
    	if(obj != null && obj instanceof User) {
    		if(id == ((User)obj).id) {
    			bresult = true;
    		}
    	}
    	
    	return bresult;
    	
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public String toString() {
        // 직접 구현
    	String result = "ID는 " + id;
    	result = result.concat(" 이름은 : " + name);    	
    	return result;
    }
	
}
