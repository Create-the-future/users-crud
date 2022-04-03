import { Result, Button } from 'antd';
import { useRequest, request, Loading } from 'umi';


export async function outLogin(options?: { [key: string]: any }) {
  return request<any>('/api/users/article', {
    method: 'GET',
    ...(options || {}),
  });
}




const home = () => {
  const { data, error, loading } = useRequest(outLogin);
  if (loading) {
    return <div>loading...</div>;
  }
  if (error) {
    return <div>{error.message}</div>;
  }
  return (
    <>
      <Result
        status="success"
        title="接口访问成功"
        extra={[
          <Button type="primary" key="console">
            Go Console
          </Button>,
          <Button key="buy">Buy Again</Button>,
        ]}
      />,
    </>

  )
}

export default home
