public class DynamicReportGenerator {
    public static void main(String[] args) {
    StringBuilder report = new StringBuilder("Report for ");
        report.append("2025-07-18");
        report.append("\n--- Daily Summary ---");
        report.append("\n Sales: 500 units");
        report.append("\n Revenue: 50,000");
        int index = report.indexOf("Daily Summary");
        report.insert(index, "Priya's ");
        System.out.println(report.toString());
    }
}
