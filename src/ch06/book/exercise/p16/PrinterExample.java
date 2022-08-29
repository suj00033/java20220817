package ch06.book.exercise.p16;

public class PrinterExample {
	public static void main(String[] args) {
		Printer printer = new Printer();			// 인스턴스를 만들고 실행
		printer.printerln(10);
		printer.printerln(true);
		printer.printerln(5.7);
		printer.printerln("홍길동");		
	}
}
