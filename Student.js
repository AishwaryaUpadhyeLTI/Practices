"use strict";
exports.__esModule = true;
var Student = /** @class */ (function () {
    function Student(studentId, studentName, studentDept) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentDept = studentDept;
    }
    Student.prototype.displayInfo = function () {
        console.log("StudentInfo:\nStudentId: " + this.studentId + "\nStudentName: " + this.studentName + "\nStudentDept: " + this.studentDept);
    };
    Student.prototype.hascondition = function (department) {
        return this.studentDept.toLowerCase === department.toLowerCase;
    };
    return Student;
}());
exports.Student = Student;
var student = new Student(1, "Aishwarya", "Aero");
student.displayInfo();
if (student.hascondition("Aero")) {
    console.log("This is Valid");
}
else {
    console.log("Invalid");
}
