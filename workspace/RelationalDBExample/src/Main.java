public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JDBCExample exampleDB = new JDBCExample();
		exampleDB.dropTable();
		exampleDB.dropDatabase();
		exampleDB.createDatabase();
		exampleDB.selectDatabase();
		exampleDB.createTable();
		exampleDB.insertRecords();
		exampleDB.selectRecords();
		exampleDB.updateRecords();
		exampleDB.deleteRecords();
		exampleDB.selectRecordsWithWhere();
		exampleDB.selectRecordsWithLike();
		exampleDB.sortRecords();
	}
}
