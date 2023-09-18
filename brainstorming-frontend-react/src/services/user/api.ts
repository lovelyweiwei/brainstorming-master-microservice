import {request} from "@@/exports";

/** 获取当前的用户 GET */
export async function getCurrentUser(options?: { [key: string]: any }) {
  return request<API.R>('/get/login', {
    method: 'GET',
    ...(options || {}),
  });
}

/** 退出登录接口 POST */
export async function outLogin(options?: { [key: string]: any }) {
  return request<API.R>('/logout', {
    method: 'POST',
    ...(options || {}),
  });
}
