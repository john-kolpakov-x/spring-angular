export function delayTimeout(timeoutMillis: number): Promise<void> {
  return new Promise(callback => {
    setTimeout(callback, timeoutMillis);
  });
}
