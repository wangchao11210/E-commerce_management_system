CREATE TABLE emp
	(
	empno INTEGER(4) NOT NULL,
	ename VARCHAR(10),
	job VARCHAR(9),
	mgr INTEGER(4),
	hiredate DATE,
	sal DECIMAL(7,2),
	comm DECIMAL(7,2),
	deptno INTEGER(2)
	);
	
	INSERT INTO EMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO)
VALUES (7369, 'SMITH', 'CLERK', 7902, STR_TO_DATE('17-12-1980', '%d-%m-%Y'), 800.00, NULL, 20);
INSERT INTO EMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO)
VALUES (7499, 'ALLEN', 'SALESMAN', 7698, STR_TO_DATE('20-02-1981', '%d-%m-%Y'), 1600.00, 300.00, 30);
INSERT INTO EMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO)
VALUES (7521, 'WARD', 'SALESMAN', 7698, STR_TO_DATE('22-02-1981', '%d-%m-%Y'), 1250.00, 500.00, 30);
INSERT INTO EMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO)
VALUES (7566, 'JONES', 'MANAGER', 7839, STR_TO_DATE('02-04-1981', '%d-%m-%Y'), 2975.00, NULL, 20);
INSERT INTO EMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO)
values (7654, 'MARTIN', 'SALESMAN', 7698, STR_TO_DATE('28-09-1981', '%d-%m-%Y'), 1250.00, 1400.00, 30);
insert into EMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO)
values (7698, 'BLAKE', 'MANAGER', 7839, STR_TO_DATE('01-05-1981', '%d-%m-%Y'), 2850.00, null, 30);
insert into EMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO)
values (7782, 'CLARK', 'MANAGER', 7839, STR_TO_DATE('09-06-1981', '%d-%m-%Y'), 2450.00, null, 10);
insert into EMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO)
values (7788, 'SCOTT', 'ANALYST', 7566, STR_TO_DATE('19-04-1987', '%d-%m-%Y'), 3000.00, null, 20);
insert into EMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO)
values (7839, 'KING', 'PRESIDENT', null, STR_TO_DATE('17-11-1981', '%d-%m-%Y'), 5000.00, null, 10);
insert into EMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO)
values (7844, 'TURNER', 'SALESMAN', 7698, STR_TO_DATE('08-09-1981', '%d-%m-%Y'), 1500.00, 0.00, 30);
insert into EMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO)
values (7876, 'ADAMS', 'CLERK', 7788, STR_TO_DATE('23-05-1987', '%d-%m-%Y'), 1100.00, null, 20);
insert into EMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO)
values (7900, 'JAMES', 'CLERK', 7698, STR_TO_DATE('03-12-1981', '%d-%m-%Y'), 950.00, null, 30);
insert into EMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO)
values (7902, 'FORD', 'ANALYST', 7566, STR_TO_DATE('03-12-1981', '%d-%m-%Y'), 3000.00, null, 20);
insert into EMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO)
values (7934, 'MILLER', 'CLERK', 7782, STR_TO_DATE('23-01-1982', '%d-%m-%Y'), 1300.00, null, 10);

SELECT * FROM emp;

SELECT COUNT(*) FROM emp;

select max(empno) from emp 

select distinct job from emp where job is not null

select distinct deptno from emp where deptno is not null

SELECT * FROM emp where empno = 00000 OR ename = 'WARD'

CREATE TABLE goods
	(
	godno INTEGER(4) NOT NULL,
	godname VARCHAR(10),
	godtype VARCHAR(9),
	hiredate DATE,
	pahiredate DATE,
	godtypeno INTEGER(4)
	);
	
	insert into EMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO)
values (7934, 'MILLER', 'CLERK', 7782, STR_TO_DATE('23-01-1982', '%d-%m-%Y'), 1300.00, null, 10);
	
	INSERT INTO goods (godno,godname,godtype,hiredate,pahiredate,godtypeno) 
		VALUES(1124,'HUAWEI','TELEPHONE',STR_TO_DATE('17-12-2015', '%d-%m-%Y'),STR_TO_DATE('17-12-2025', '%d-%m-%Y'),2413);
		
		
		INSERT INTO goods (godno,godname,godtype,hiredate,pahiredate,godtypeno) 
		VALUES(1125,'OPPO','TELEPHONE',STR_TO_DATE('19-10-2010', '%d-%m-%Y'),STR_TO_DATE('11-11-2015', '%d-%m-%Y'),2414);
		
		INSERT INTO goods (godno,godname,godtype,hiredate,pahiredate,godtypeno) 
		VALUES(1126,'MEIZU','TELEPHONE',STR_TO_DATE('11-09-2009', '%d-%m-%Y'),STR_TO_DATE('25-01-2016', '%d-%m-%Y'),2415);
		
		INSERT INTO goods (godno,godname,godtype,hiredate,pahiredate,godtypeno) 
		VALUES(1127,'XIAOMI','TELEPHONE',STR_TO_DATE('01-12-2011', '%d-%m-%Y'),STR_TO_DATE('14-12-2021', '%d-%m-%Y'),2416);
		
		INSERT INTO goods (godno,godname,godtype,hiredate,pahiredate,godtypeno) 
		VALUES(1128,'LUOBINI','WATCH',STR_TO_DATE('10-12-2005', '%d-%m-%Y'),STR_TO_DATE('11-07-2015', '%d-%m-%Y'),2417);
		
		INSERT INTO goods (godno,godname,godtype,hiredate,pahiredate,godtypeno) 
		VALUES(1129,'TIANWANG','WATCH',STR_TO_DATE('11-10-2014', '%d-%m-%Y'),STR_TO_DATE('14-05-2025', '%d-%m-%Y'),2418);
		
		INSERT INTO goods (godno,godname,godtype,hiredate,pahiredate,godtypeno) 
		VALUES(1130,'CASIO','WATCH',STR_TO_DATE('10-09-2013', '%d-%m-%Y'),STR_TO_DATE('11-12-2014', '%d-%m-%Y'),2419);
		
		INSERT INTO goods (godno,godname,godtype,hiredate,pahiredate,godtypeno) 
		VALUES(1131,'HUIPU','COMPUTER',STR_TO_DATE('05-06-2014', '%d-%m-%Y'),STR_TO_DATE('07-08-2021', '%d-%m-%Y'),2420);
		
		INSERT INTO goods (godno,godname,godtype,hiredate,pahiredate,godtypeno) 
		VALUES(1132,'LEVNO','COMPUTER',STR_TO_DATE('04-03-2002', '%d-%m-%Y'),STR_TO_DATE('01-12-2011', '%d-%m-%Y'),2421);
		
		INSERT INTO goods (godno,godname,godtype,hiredate,pahiredate,godtypeno) 
		VALUES(1133,'HUASUO','COMPUTER',STR_TO_DATE('05-04-2003', '%d-%m-%Y'),STR_TO_DATE('12-01-2012', '%d-%m-%Y'),2422);
		
		INSERT INTO goods (godno,godname,godtype,hiredate,pahiredate,godtypeno) 
		VALUES(1134,'APPLE','TELEPHONE',STR_TO_DATE('06-07-2008', '%d-%m-%Y'),STR_TO_DATE('09-10-2011', '%d-%m-%Y'),2423);
		
		SELECT * FROM goods;
		
		SELECT * FROM `user`;
		
		select max(godno) from goods