package day11;

class Connection  implements AutoCloseable {

    private String name;

    Connection(String name) {
        this.name = name;
        System.out.println(name + " 연결");
    }

    void execute() {
        System.out.println(name + " 실행");
    }

    @Override
    public void close() {
        System.out.println(name + " 종료");
    }
}
