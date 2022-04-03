export interface SingleUserType {
  id: number;
  name: string;
  email: string;
  create_time: string;
  update_time: string;
  status: number;
}

export interface SingleUserTypeList {
  countId: null;
  current: number;
  maxLimit: null;
  optimizeCountSql: boolean;
  orders: [];
  pages: number;
  records: [];
  searchCount: boolean;
  size: number;
  total: number;
}

export interface FormValues {
  [name: string]: any;
}
