export class Student{
    private studentId:number;
    private studentName:string;
    private studentDept:string;

    constructor(studentId:number,studentName:string,studentDept:string){
        this.studentId=studentId;
        this.studentName=studentName;
        this.studentDept=studentDept;

    }

    displayInfo():void{
        console.log(`StudentInfo:\nStudentId: ${this.studentId}\nStudentName: ${this.studentName}\nStudentDept: ${this.studentDept}`)

    }

    hascondition(department:string) : boolean {
        return this.studentDept.toLowerCase === department.toLowerCase;


    }


}

const student=new Student(1,"Aishwarya","Aero");
student.displayInfo();
if(student.hascondition("Aero")){
    console.log("This is Valid");
}
else{
    console.log("Invalid");
}
