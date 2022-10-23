export class Category {

  id:number;
  categoryName:string;
  creationDate:Date;
  updateDate:Date;


  constructor(id: number, categoryName: string, creationDate: Date, updateDate: Date) {
    this.id = id;
    this.categoryName = categoryName;
    this.creationDate = creationDate;
    this.updateDate = updateDate;
  }
}
