import { defineConfig } from 'umi';

export default defineConfig({
  nodeModulesTransform: {
    type: 'none',
  },
  // routes: [
  //   { path: '/', component: '@/pages/index' },
  //   { path: '/home', component: '@/pages/home' },
  //   { path: '/about', component: '@/pages/about' },
  // ],
  // fastRefresh: {},
  proxy: {
    '/api': {
      'target': 'http://127.0.0.1:5088/',
      'changeOrigin': true,
      'pathRewrite': { '^/api' : '' },
    },
  },
});
