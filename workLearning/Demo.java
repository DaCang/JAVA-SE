@Test
public void test1() {//StringTokenizer分解字符串
	String sql="insert into tbl_dept_job (dept_id,job_id,job_name,add_user,add_time,isflag)values('200801171302','specialty5','交换','system',to_char(sysdate,'YYYY-MM-DD HH24:MI:SS'),'0') " +
			"◎insert into tbl_dept_job (dept_id,job_id,job_name,add_user,add_time,isflag)values('200801171302','specialty10','无线岗','system',to_char(sysdate,'YYYY-MM-DD HH24:MI:SS'),'0') " +
			"◎insert into tbl_dept_job (dept_id,job_id,job_name,add_user,add_time,isflag)values('200801171302','specialty11','3G岗','system',to_char(sysdate,'YYYY-MM-DD HH24:MI:SS'),'0') ◎";
	StringTokenizer token = new StringTokenizer(sql, "◎");
	int num = token.countTokens();
	System.out.println(num);
        while (token.hasMoreTokens()) {
            System.out.println(token.nextToken());
        }
}
