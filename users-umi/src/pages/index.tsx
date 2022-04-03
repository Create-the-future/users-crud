import styles from './index.less';
import { Button, Space } from 'antd'
import { useRequest } from 'umi'


export default function IndexPage() {

  return (
    <div>
      <h1 className={styles.title}>Page index</h1>
      <Space>
        <Button type='primary' onClick={() => { console.log('Hello...') }}>SUCCESS</Button>
        <Button>Default Button</Button>
        <Button type="dashed">Dashed Button</Button>
        <Button type="text">Text Button</Button>
        <Button type="link">Link Button</Button>
      </Space>

    </div>
  );
}
